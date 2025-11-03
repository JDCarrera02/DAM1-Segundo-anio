package Ejer7;

import Ejer5.Book2;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Author2 {
    private String name;
    private List<Book2> booksWritten;

    public Author2(String name) {
        this.name = name;
        this.booksWritten = new ArrayList<>();
    }

    public Author2() {
        this.booksWritten = new ArrayList<>();
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public List<Book2> getBooksWritten() {
        return booksWritten;
    }

    public void mostrarLibrosAutor(){
        if (!booksWritten.isEmpty()){
            for (Book2 libro:booksWritten){
                System.out.println(libro.getTitle()+", " + libro.getYearPublished());
            }
        }
    }
}