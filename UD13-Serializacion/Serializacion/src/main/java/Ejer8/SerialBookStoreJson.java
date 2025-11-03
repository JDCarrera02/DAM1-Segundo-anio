package Ejer8;

import Ejer1.Book;
import Ejer7.Author;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerialBookStoreJson {
    public static void main(String[] args) {
        BookStore tienda1 = new BookStore("TodoFilm");
        // Creamos dos autores
        Author autor1 = new Author("George Orwell");
        Author autor2 = new Author("Aldous Huxley");
        // Creamos dos libros
        Book libro1 = new Book("Animal Farm","George Orwell",1945);
        Book libro2 = new Book("Brave New World","Aldous Huxley",1932);
        // Insertamos los elementos a las listas de BookStore
        tienda1.getListaLibros().add(libro1);tienda1.getListaLibros().add(libro2);
        tienda1.getListaAutores().add(autor1);tienda1.getListaAutores().add(autor2);

        // Serializamos el objeto a json. Primero creamos el objeto ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(tienda1);
            System.out.println(json);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}