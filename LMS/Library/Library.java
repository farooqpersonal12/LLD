package Library;

import java.util.ArrayList;
import java.util.List;

import Book.Book;
import BorrowingPolicy.BorrowingPolicy;
import BorrowingPolicy.BorrowingPolicyFactory;
import Loan.Loan;
import User.User;
import enumDatatype.LoanStatus;


public class Library {

    private List<Book> books;
    private List<User> users;
    private List<Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    private final BorrowingPolicyFactory borrowingPolicyFactory = new BorrowingPolicyFactory();

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public User findUserById(String userId) {

        for (User user : users) {
            if (userId.equals(user.getUserId())) {
                return user;
            }
        }
        return null;
    }

    public Book findBookById(String bookId) {

        for (Book book : books) {
            if (bookId.equals(book.getBookId())) {
                return book;
            }
        }
        return null;
    }

    public boolean isBookAvailable(String bookId) {

        for (Loan loan : loans) {
            if (bookId.equals(loan.getBook().getBookId()) &&
                    loan.getStatus() == LoanStatus.BORROWED) {
                return false;
            }
        }
        return true;
    }

    public List<Loan> getLoansByUserId(String userId) {

        List<Loan> userLoans = new ArrayList<>();

        for (Loan loan : loans) {
            if (userId.equals(loan.getUser().getUserId())) {
                userLoans.add(loan);
            }
        }

        return userLoans;
    }

    public void borrowBook(String userId, String bookId) {

        BorrowingPolicy borrowingPolicy = null;
        User user = findUserById(userId);

        if (user == null) {
            System.out.println(
                    "User is not registered. Please register to complete your operation.");
            return;
        }

        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println(
                    "The requested book does not exist in the library.");
            return;
        }

        if (!isBookAvailable(bookId)) {
            System.out.println(
                    "The book has already been borrowed. Please try again later.");
            return;
        }
        borrowingPolicy = borrowingPolicyFactory.getUserPolicy(user.getUserType());
        Loan loan = new Loan(book, user, borrowingPolicy);
        addLoan(loan);
        System.out.println(loan.getDetails());
    }

    public void returnBook(String userId, String bookId) {

        User user = findUserById(userId);
        Book book = findBookById(bookId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        for (Loan loan : loans) {

            if (bookId.equals(loan.getBook().getBookId())
                    && userId.equals(loan.getUser().getUserId())
                    && loan.getStatus() == LoanStatus.BORROWED) {

                loan.markAsReturned();
                addBook(book); // book becomes available again

                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("No active loan found for this user and book.");
    }
}
