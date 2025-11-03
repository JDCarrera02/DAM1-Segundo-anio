package Ejer9;

import Ejer5.Book2;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Publisher2 {
    private String name;
    private String address;
    private List<Book2> listaLibros;

    public Publisher2(String name, String address, List<Book2> listaLibros) {
        this.name = name;
        this.address = address;
        this.listaLibros = listaLibros;
    }

    public Publisher2() {
        this.listaLibros = new ArrayList<>();
    }

    public Publisher2(String name, String address) {
        this.name = name;
        this.address = address;
        this.listaLibros = new ArrayList<>();
    }
    @XmlElement
    public String getName() {
        return name;
    }
    @XmlElement
    public String getAddress() {
        return address;
    }
    @XmlElement
    public List<Book2> getListaLibros() {
        return listaLibros;
    }

    public void nombreLibros(){
        for (Book2 libro: listaLibros){
            System.out.println(libro.getTitle());
        }
    }
}