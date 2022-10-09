package ru.skypro;

public class Book {

    private String bookName;
    private int year;
    private Author author;

    public Book(String bookName, int year, Author author) {
        this.bookName = bookName;
        this.year = year;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
