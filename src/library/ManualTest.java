package library;

public class ManualTest {
    public static void runAllTests() {
        testBookCreation();
        testBorrowBook();
        testBorrowBookWhenNotAvailable();
        testReturnBook();
        testAddBook();
        testBorrowBookFromLibrary();
        testReturnBookToLibrary();
        System.out.println("All manual tests completed.");
    }

    public static void testBookCreation() {
        Book book = new Book("1234567890", "Test Book", "Test Author", 2021);
        assertEqual("Test Book", book.getTitle(), "testBookCreation - Title");
        assertEqual(true, book.isAvailable(), "testBookCreation - Availability");
    }

    public static void testBorrowBook() {
        Book book = new Book("1234567890", "Test Book", "Test Author", 2021);
        book.borrowBook();
        assertEqual(false, book.isAvailable(), "testBorrowBook - Availability after borrow");
    }

    public static void testBorrowBookWhenNotAvailable() {
        try {
            Book book = new Book("1234567890", "Test Book", "Test Author", 2021);
            book.borrowBook();
            book.borrowBook(); // This should throw an exception
            System.out.println("testBorrowBookWhenNotAvailable - Failed");
        } catch (IllegalStateException e) {
            System.out.println("testBorrowBookWhenNotAvailable - Passed");
        }
    }

    public static void testReturnBook() {
        Book book = new Book("1234567890", "Test Book", "Test Author", 2021);
        book.borrowBook();
        book.returnBook();
        assertEqual(true, book.isAvailable(), "testReturnBook - Availability after return");
    }
}
