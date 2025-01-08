package org.book;

import java.util.List;

public class Library {
    public List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public boolean isAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("Był true");
                return true;
            }
            System.out.println("Był fałsz");
        }
        return false;
    }
}
