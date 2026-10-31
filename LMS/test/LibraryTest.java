package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.Test;

import Book.Book;
import BorrowingPolicy.BorrowingPolicy;
import BorrowingPolicy.BorrowingPolicyFactory;
import Library.Library;
import Loan.Loan;
import User.User;
import enumDatatype.LoanStatus;
import enumDatatype.MembershipType;

public class LibraryTest {

    @Test
    public void testFindUserById() {
        Library library = new Library();

        User user = new User();
        user.setUserId("U001");
        user.setName("Umar");

        library.registerUser(user);

        User result = library.findUserById("U001");

        assertNotNull(result);
        assertEquals("U001", result.getUserId());

    }

    @Test
    public void shouldReturnNullWhenUserDoesNotExist() {
        Library library = new Library();

        User result = library.findUserById("U999");

        assertNull(result);
    }

    @Test
    public void testFindBookById() {
        Library library = new Library();

        Book book = new Book();
        book.setBookId("B001");
        book.setBookName("A Language od dragons");
        book.setAuthor("Willioms");

        library.addBook(book);

        Book res = library.findBookById("B001");
        assertNotNull(res);
        assertEquals("B001", res.getBookId());

    }

    @Test
    public void testIsBookAvailableShuoldretutnTRUE() {
        Library library = new Library();

        Book book = new Book();
        book.setBookId("B001");
        book.setBookName("A Language od dragons");
        book.setAuthor("Willioms");

        library.addBook(book);

        boolean isAvailable = library.isBookAvailable("B001");

        assertTrue(isAvailable);
    }

    // @Test
    // public void testborrowBook() {
    // Library library = new Library();
    // User user = new User();
    // user.setUserId("U001");
    // user.setName("Umar");

    // library.registerUser(user);

    // Book book = new Book();
    // book.setBookId("B001");
    // book.setBookName("A Language of dragons");
    // book.setAuthor("Willioms");

    // library.addBook(book);

    // User result = library.findUserById("U001");
    // Book res = library.findBookById("B001");
    // boolean isAvailable = library.isBookAvailable("B001");
    // Loan loan = new Loan(book, user);
    // library.addLoan(loan);

    // library.borrowBook("U001", "B001");

    // List<Loan> userLoans = library.getLoansByUserId("U001");

    // assertEquals(1, userLoans.size());

    // Loan loan1 = userLoans.get(0);

    // assertEquals("B001", loan1.getBook().getBookId());
    // assertEquals("U001", loan1.getUser().getUserId());
    // assertEquals(LoanStatus.BORROWED, loan1.getStatus());

    // assertFalse(library.isBookAvailable("B001"));
    // }

    @Test
    public void testPremiumUserBorrowingPeriod() {

        Library library = new Library();

        User user = new User();
        user.setUserId("U001");
        user.setName("Umar");
        user.setUserType(MembershipType.PREMIUM);

        library.registerUser(user);

        Book book = new Book();
        book.setBookId("B001");
        book.setBookName("A Language of Dragons");
        book.setAuthor("Williamson");

        library.addBook(book);

        library.borrowBook("U001", "B001");

        List<Loan> userLoans = library.getLoansByUserId("U001");

        assertEquals(1, userLoans.size());

        Loan loan = userLoans.get(0);

        assertEquals(
                loan.getBorrowDate().plusDays(30),
                loan.getdueDate());
    }

}
