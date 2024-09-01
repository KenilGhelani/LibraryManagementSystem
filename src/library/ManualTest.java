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
}
