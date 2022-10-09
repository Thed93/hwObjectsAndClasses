package ru.skypro;

public class Main {
    public static void aboutBook (String bookName, String authorName, String authoeLastName, int year) {
        System.out.println("Книга " + bookName + " была написана " + authorName + " " + authoeLastName + " в " + year + " году.");

    }
    public static void main(String[] args) {
        Author author = new Author("William", "Golding");
        Author author1 = new Author("Jorg", "Greyson");

        Book book = new Book("Fly leader", 1954,author);
        Book book1 = new Book("Most reach man in Vavilon", 2005, author1);

        aboutBook(book.getBookName(), book.getAuthor().getName(), book.getAuthor().getLastName(), book.getYear());
        aboutBook(book1.getBookName(), book1.getAuthor().getName(), book1.getAuthor().getLastName(), book1.getYear());
        System.out.println();

        book.setYear(2000);
        aboutBook(book.getBookName(), book.getAuthor().getName(), book.getAuthor().getLastName(), book.getYear());




    }
}
