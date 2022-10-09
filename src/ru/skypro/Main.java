package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("William", "Golding");
        Author author1 = new Author("Jorg", "Greyson");

        Book book = new Book("Fly leader", 1954,author);
        Book book1 = new Book("Most reach man in Vavilon", 2005, author1);
        System.out.println(book);
        System.out.println(book1);


        System.out.println();

        book.setYear(2000);
        System.out.println(book);





    }
}
