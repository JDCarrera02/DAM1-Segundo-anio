package Ejer9;

import Ejer1.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerialPublisherJson {
    public static void main(String[] args) {
        // Creamos el objeto publisher
        Publisher publicador1 = new Publisher("El Tiempo","Calle 23 No. 56-34");
        // Creamos los libros
        Book libro1 = new Book("The Time Machine","H.G Wells",1895);
        Book libro2 = new Book("1984","George Orwell",1945);
        // Insertamos los libros a la lista de Publisher
        publicador1.getListaLibros().add(libro1);publicador1.getListaLibros().add(libro2);
        // Creo el objeto que solo obtiene los nombres de los libros "Title"
        PublisherDTO publicadorNombres = new PublisherDTO(publicador1);
        // Creo el object mapper
        ObjectMapper objectMapper = new ObjectMapper();
        // Serializacion con Json
        try {
            // Le paso el objeto publicadorDTO y para escribir sus valores a String
            String json = objectMapper.writeValueAsString(publicadorNombres);
            System.out.println(json); // Imprimo los resultados
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}