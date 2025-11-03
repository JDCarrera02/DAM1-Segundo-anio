package Ejer1;

public class Book {
    protected String title, author;
    protected int yearPublished;

    public Book() {

    }

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Libro" + "\n"+
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "yearPublished: " + yearPublished;
    }
}