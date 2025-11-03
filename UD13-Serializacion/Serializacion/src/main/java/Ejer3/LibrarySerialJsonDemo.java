package Ejer3;

import Ejer1.Book;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class LibrarySerialJsonDemo {
    public static void main(String[] args) {
        Library libreria = new Library();

        // Creo dos libros para guardar
        libreria.aniadirLibros(new Book("Brave New World","Aldous Huxley",1936));
        libreria.aniadirLibros(new Book("1984","George Orwell",1942));

        String json = libreria.convertirJson();
        System.out.println(json);
    }
}