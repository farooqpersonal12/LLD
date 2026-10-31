package Loan;

import java.time.LocalDate;
import java.util.UUID;

import javax.swing.border.Border;

import Book.Book;
import BorrowingPolicy.BorrowingPolicy;
import User.User;
import enumDatatype.LoanStatus;

public class Loan {

    private String loanId;
    private Book book;
    private User user;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public Loan(Book book, User user,BorrowingPolicy borrowingPolicy) {
        this.loanId = UUID.randomUUID().toString();
        this.book = book;
        this.user = user;
        this.borrowDate = LocalDate.now();
        int dueDateWithPolicy = borrowingPolicy.getBorrowingDays();
        this.dueDate = borrowDate.plusDays(dueDateWithPolicy);
        this.returnDate = null;
        this.status = LoanStatus.BORROWED;
    }

    public void markAsReturned() {
        this.status = LoanStatus.RETURNED;
        this.returnDate = LocalDate.now();
    }

    private LoanStatus status;

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setdueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public String getLoanId() {
        return loanId;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getdueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public String getDetails() {
        return "Loan [loanId=" + loanId + ", book=" + book.getBookName() + ", user=" + user.getUserId()
                + ", borrowDate=" + borrowDate
                + ", dueDate=" + dueDate + ", status=" + status + "]";
    }

}