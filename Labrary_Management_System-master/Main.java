import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Authors
        Author author = new Author("Legend-Life", "This is a legend life that yoy can learn fro it");

        // Books
        List<Author> authors = new ArrayList<>();
        authors.add(author);
        Book book = new Book("1984", "ISBN1234", authors);

        // Library
        List<Book> library = new ArrayList<>();
        Librarian librarian = new Librarian("Sarah");
        librarian.addBook(library, book);

        // Member
        Member member = new Member("M001", "Alice");

        // Loan
        Loan loan = new Loan(book, member);
        if (loan.borrowBook()) {
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        }

        // Return
        loan.returnBook();
        System.out.println("Book returned: " + loan.getReturnDate());
    }
}
