package Ejer8;

import Ejer5.Book2;
import Ejer7.Author2;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class BookStore2 {
    private String nombre;
    private List<Book2>listaLibros;
    private List<Author2>listaAutores;

    public BookStore2(String nombre, List<Book2> listaLibros, List<Author2> listaAutores) {
        this.nombre = nombre;
        this.listaLibros = listaLibros;
        this.listaAutores = listaAutores;
    }

    public BookStore2 (String nombre){
        this.nombre = nombre;
        this.listaLibros = new ArrayList<>();
        this.listaAutores = new ArrayList<>();
    }

    public BookStore2 (){
        this.listaAutores = new ArrayList<>();
        this.listaLibros = new ArrayList<>();
    }
    @XmlElement
    public String getNombre() {
        return nombre;
    }
    @XmlElement
    public List<Book2> getListaLibros() {
        return listaLibros;
    }
    @XmlElement
    public List<Author2> getListaAutores() {
        return listaAutores;
    }
}