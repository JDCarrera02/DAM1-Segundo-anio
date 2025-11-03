package Ejer7;

import Ejer1.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerialAuthorJson {
    public static void main(String[] args) {
        // Creo el objeto author con su respectivo nombre, también se inicializa por defecto la lista de libros
        Author autor1 = new Author("George Orwell");
        // Creo objetos Book2
        Book libro1 = new Book("Animal Farm","George Orwell", 1932);
        Book libro2 = new Book("1984", "George Orwell", 1945);

        autor1.getBooksWritten().add(libro1);autor1.getBooksWritten().add(libro2);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(autor1);
            System.out.println(json);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
