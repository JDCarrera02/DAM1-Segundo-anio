package Ejer8;

import Ejer5.Book2;
import Ejer7.Author2;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class SerialBookStoreXML {
    public static void main(String[] args) {
        BookStore2 tienda1 = new BookStore2("TodoFilm");
        // Creamos dos autores
        Author2 autor1 = new Author2("George Orwell");
        Author2 autor2 = new Author2("Aldous Huxley");
        // Creamos dos libros
        Book2 libro1 = new Book2("Animal Farm","George Orwell",1945);
        Book2 libro2 = new Book2("Brave New World","Aldous Huxley",1932);
        // Insertamos los elementos a las listas de BookStore
        tienda1.getListaLibros().add(libro1);tienda1.getListaLibros().add(libro2);
        tienda1.getListaAutores().add(autor1);tienda1.getListaAutores().add(autor2);

        // Serializacion con XML
        try {
            JAXBContext context = JAXBContext.newInstance(BookStore2.class);
            // Creamos el objeto Marshaller
            Marshaller marshaller = context.createMarshaller();
            // Le ponemos propiedad a ese objeto
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            // Y finalmente hacemos un system out println de esa instancia creada de XML (autor1)
            marshaller.marshal(tienda1,System.out);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}