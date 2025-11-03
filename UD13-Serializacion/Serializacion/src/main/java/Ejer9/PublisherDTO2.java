package Ejer9;

import Ejer5.Book2;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@XmlRootElement
public class PublisherDTO2 {
    private String name;
    private String address;
    private List<String>bookTitles;

    public PublisherDTO2(Publisher2 publicador) {
        this.name = publicador.getName();
        this.address = publicador.getAddress();
        this.bookTitles = publicador.getListaLibros().stream().map(Book2::getTitle).collect(Collectors.toList());
    }

    public PublisherDTO2(){
        this.bookTitles = new ArrayList<>();
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
    public List<String> getBookTitles() {
        return bookTitles;
    }
}