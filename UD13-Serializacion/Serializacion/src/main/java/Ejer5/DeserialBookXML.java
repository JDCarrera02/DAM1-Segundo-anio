package Ejer5;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;

public class DeserialBookXML {
    public static void main(String[] args) {
        String xml = " <book2><author>Philip K. Dick</author><title>Do Androids Dream of Electric Sheep?</title><yearPublished>1968</yearPublished></book2>";

        try {
            JAXBContext context = JAXBContext.newInstance(Book2.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Book2 libro1 = (Book2) unmarshaller.unmarshal(new StringReader(xml));
            System.out.println("Book title: " + libro1.getTitle());
            System.out.println("Author: " + libro1.getAuthor());
            System.out.println("Year Published: " + libro1.getYearPublished());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}