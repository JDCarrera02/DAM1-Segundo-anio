package Ejer8;

import Ejer1.Book;
import Ejer7.Author;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private String nombreTienda;
    private List<Book> listaLibros;
    private List<Author> listaAutores;

    public BookStore(List<Book> listaLibros, List<Author> listaAutores) {
        this.listaLibros = listaLibros;
        this.listaAutores = listaAutores;
    }

    public BookStore() {
        this.listaLibros = new ArrayList<>();
        this.listaAutores = new ArrayList<>();
    }

    public BookStore(String name) {
        this.nombreTienda = name;
        this.listaLibros = new ArrayList<>();
        this.listaAutores = new ArrayList<>();
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public List<Book> getListaLibros() {
        return listaLibros;
    }

    public List<Author> getListaAutores() {
        return listaAutores;
    }
}