package Ejer7;

import Ejer5.Book2;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class SerialAuthorXML {
    public static void main(String[] args) {
        Author2 autor1 = new Author2("Philip K. Dick");
        Book2 libro1 = new Book2("Do Androids Dream of Electric Sheep?","Philip K.Dick",1968);
        Book2 libro2 = new Book2("The Man in the High Castle","Philip K. Dick",1962);
        // Añado los libros al objeto Lista que está en la clase Author2 (XML)
        autor1.getBooksWritten().add(libro1);autor1.getBooksWritten().add(libro2);
        //Bloque try para convertir una instancia de Author2 en XML
        try {
            // Convertir la instancia de Author2 en XML
            JAXBContext context = JAXBContext.newInstance(Author2.class);
            // Creamos el objeto Marshaller
            Marshaller marshaller = context.createMarshaller();
            // Le ponemos propiedad a ese objeto
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            // Y finalmente hacemos un system out println de esa instancia creada de XML (autor1)
            marshaller.marshal(autor1,System.out);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}