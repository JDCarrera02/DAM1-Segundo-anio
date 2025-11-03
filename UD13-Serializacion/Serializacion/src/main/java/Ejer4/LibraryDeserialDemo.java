package Ejer4;

import Ejer1.Book;
import Ejer3.Library;

public class LibraryDeserialDemo {
    public static void main(String[] args) {
        Library libreria = new Library();
        libreria.aniadirLibros(new Book("Harry Potter", "J.K. Rowling", 1997));
        libreria.aniadirLibros(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));

        String json = libreria.convertirJson();
        System.out.println(json);

        Library jsonClaseConvertida = libreria.convertirClase(json);
        System.out.println("Biblioteca deserializada: ");
        for (Book libro: jsonClaseConvertida.getListaLibros()){
            System.out.println(libro.getTitle() + " - " + libro.getAuthor() + " (" + libro.getYearPublished() + ") ");
        }
    }
}