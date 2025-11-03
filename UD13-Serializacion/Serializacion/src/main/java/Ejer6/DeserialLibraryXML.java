package Ejer6;

import Ejer5.Book2;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;

public class DeserialLibraryXML {
    public static void main(String[] args) {
        String xml = "<library2><listaLibros><author>H.G Wells</author><title>The Time Machine</title><yearPublished>1895</yearPublished></listaLibros><listaLibros><author>George Orwell</author><title>Animal Farm</title><yearPublished>1932</yearPublished></listaLibros></library2>";
        try {
            JAXBContext context = JAXBContext.newInstance(Library2.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Library2 libreria1 = (Library2) unmarshaller.unmarshal(new StringReader(xml));
            for (Book2 libro : libreria1.getListaLibros()){
                System.out.println(libro.getTitle()+", "+libro.getAuthor()+", "+libro.getYearPublished());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}