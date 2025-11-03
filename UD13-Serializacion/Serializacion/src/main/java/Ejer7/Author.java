package Ejer7;

import Ejer1.Book;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book>booksWritten;

    public Author(String name, List<Book> booksWritten) {
        this.name = name;
        this.booksWritten = booksWritten;
    }

    public Author() {
        this.booksWritten = new ArrayList<>();
    }

    public Author(String name){
        this.name = name;
        this.booksWritten = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooksWritten() {
        return booksWritten;
    }
}