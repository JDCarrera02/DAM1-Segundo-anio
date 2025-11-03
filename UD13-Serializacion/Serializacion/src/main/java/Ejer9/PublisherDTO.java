package Ejer9;

import Ejer1.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PublisherDTO {
    private String name;
    private String address;
    private List<String>bookTitles;

    public PublisherDTO(Publisher publicador) {
        this.name = publicador.getName();
        this.address = publicador.getAddress();
        this.bookTitles = publicador.getListaLibros().stream().map(Book::getTitle).collect(Collectors.toList());
    }

    public PublisherDTO(){
        this.bookTitles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getBookTitles() {
        return bookTitles;
    }
}