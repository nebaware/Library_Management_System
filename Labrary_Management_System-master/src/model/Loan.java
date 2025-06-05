package model;

import java.util.Date;

public class Loan {
    private Book book;
    private Member member;
    private Date borrowDate;
    private Date returnDate;

    public Loan(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.borrowDate = new Date();
        this.returnDate = null;
    }

    public boolean borrowBook() {
        if (!book.isAvailable()) {
            System.out.println("Book is not available.");
            return false;
        }
        book.setAvailability(false);
        member.addLoan(this);
        return true;
    }

    public void returnBook() {
        book.setAvailability(true);
        this.returnDate = new Date();
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }
}
