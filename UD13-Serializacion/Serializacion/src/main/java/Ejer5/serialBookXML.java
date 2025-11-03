package Ejer5;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class serialBookXML {
    public static void main(String[] args) {
        Book2 libro1 = new Book2("Do Androids Dream of Electric Sheep?", "Philip K. Dick", 1968);

        try {
            JAXBContext context = JAXBContext.newInstance(Book2.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(libro1,System.out);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}