package Ejer3;

import Ejer1.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.List;

public class Library {
    protected List<Book> listaLibros;

    public Library(List<Book> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public Library() {
        this.listaLibros = new ArrayList<>();
    }

    // Serializar la clase a JSON
    public String convertirJson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            return objectMapper.writeValueAsString(this);
        } catch (Exception e) {
            return null;
        }
    }

    // Deserializar un json a la clase library
    public Library convertirClase(String json){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, Library.class);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Book> getListaLibros() {
        return listaLibros;
    }

    public void aniadirLibros(Book libro){
        if (libro != null){
            listaLibros.add(libro);
        }
    }

}