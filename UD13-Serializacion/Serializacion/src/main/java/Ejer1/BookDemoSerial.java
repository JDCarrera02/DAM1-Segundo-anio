package Ejer1;

/*
* 1. Ejercicio 1: Crear una clase “Book” con campos para “title”, “author”, y “yearPublished”.
* Serializar una instancia de “Book” a JSON usando FasterXML.
* */

import com.fasterxml.jackson.databind.ObjectMapper;

public class BookDemoSerial {
    public static void main(String[] args) {
        Book libro1 = new Book("Brave New World", "Aldous Huxley", 1932);
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String json = objectMapper.writeValueAsString(libro1);
            System.out.println(json);
        } catch (Exception e){
            System.out.println("Error al convertir la instancia");;
        }
    }
}