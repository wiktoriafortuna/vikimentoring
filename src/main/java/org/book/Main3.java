package org.book;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("Xman");
        Book book3 = new Book("Christmas");
        List<Book> books = new ArrayList<>(); // to tworzy liste (kolekcje)
        System.out.println(books); // tutaj jest pusta lista
        books.add(book1); // to dodaje ksiazke 1 do kolekcji
        System.out.println(books); // tutaj mamy 1 ksiazke
        books.add(book2);// to dodaje ksiazke 2 do kolekcji
        System.out.println(books); // tutaj mamy 2 ksiazke
        books.add(book3); // to dodaje ksiazke 3 do kolekcji
        System.out.println(books); // mamy 3 książki dodane

        Library library = new Library(books);

        boolean isHarryPotterAvailable = library.isAvailable("Christmas");
        System.out.println(isHarryPotterAvailable);
    }
}

