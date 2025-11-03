package Ejer6;

import Ejer5.Book2;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class SerialLibraryXML {
    public static void main(String[] args) {
        Book2 libro1 = new Book2("The Time Machine", "H.G Wells", 1895);
        Book2 libro2 = new Book2("Animal Farm", "George Orwell", 1932);
        Library2 libreria1 = new Library2();
        libreria1.getListaLibros().add(libro1); libreria1.getListaLibros().add(libro2);

        try {
            JAXBContext context = JAXBContext.newInstance(Library2.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(libreria1,System.out);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}