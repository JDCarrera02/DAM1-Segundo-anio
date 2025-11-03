package Ejer9;

import Ejer5.Book2;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class SerialPublisherXML {
    public static void main(String[] args) {
        Publisher2 publicador1 = new Publisher2("El Tiempo","Calle 23 No. 56-34");
        // Creamos los libros
        Book2 libro1 = new Book2("The Time Machine","H.G Wells",1895);
        Book2 libro2 = new Book2("1984","George Orwell",1945);
        // Insertamos los libros a la lista de Publisher
        publicador1.getListaLibros().add(libro1);publicador1.getListaLibros().add(libro2);
        // Creo el objeto que solo obtiene los nombres de los libros "Title"
        PublisherDTO2 publicadorNombres = new PublisherDTO2(publicador1);

        // Serializacion con XML
        try {
            JAXBContext context = JAXBContext.newInstance(PublisherDTO2.class);
            // Creamos el objeto Marshaller
            Marshaller marshaller = context.createMarshaller();
            // Le ponemos propiedad a ese objeto
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            // Y finalmente hacemos un system out println de esa instancia creada de XML (publicadorNombres)
            marshaller.marshal(publicadorNombres,System.out);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}