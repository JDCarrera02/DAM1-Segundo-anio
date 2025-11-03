package Ejer2;

import Ejer1.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Book2DemoDeserial {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String json = "{\"title\":\"Brave New World\",\"author\":\"Aldous Huxley\",\"yearPublished\":1932}";
            Book libroDes = objectMapper.readValue(json,Book.class);
            System.out.println("Title: " + libroDes.getTitle());
            System.out.println("Author: " + libroDes.getAuthor());
            System.out.println("Year Published: " + libroDes.getYearPublished());

        }catch (Exception e){
            System.out.println("Error al deserializar el archivo");
        }
    }
}