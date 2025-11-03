package Ejer9;

import Ejer1.Book;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String name;
    private String address;
    private List<Book> listaLibros;

    public Publisher(String name, String address, List<Book> listaLibros) {
        this.name = name;
        this.address = address;
        this.listaLibros = listaLibros;
    }

    public Publisher() {
        this.listaLibros = new ArrayList<>();
    }

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
        this.listaLibros = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Book> getListaLibros() {
        return listaLibros;
    }

    public void nombreLibros(){
        for (Book libro: listaLibros){
            System.out.println(libro.getTitle());
        }
    }
}
