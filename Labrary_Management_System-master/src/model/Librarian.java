package model;

import java.util.List;

public class Librarian {
    private String name;
     private String position;
    public Librarian(String name) {
        this.name = name;
    }
 public LibrarianPosition(String position) {
        this.position  = position;
    }
    public void addBook(List<Book> library, Book book) {
        library.add(book);
    }

    public void removeBook(List<Book> library, Book book) {
        library.remove(book);
    }

}
