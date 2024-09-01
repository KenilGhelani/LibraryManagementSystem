package library;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public Book borrowBook(String isbn) {
        Book book = books.get(isbn);
        if (book == null || !book.isAvailable()) {
            throw new IllegalStateException("Book is not available for borrowing.");
        }
        book.borrowBook();
        return book;
    }

    public void returnBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null) {
            book.returnBook();
        }
    }

    public Map<String, Book> viewAvailableBooks() {
        Map<String, Book> availableBooks = new HashMap<>();
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            if (entry.getValue().isAvailable()) {
                availableBooks.put(entry.getKey(), entry.getValue());
            }
        }
        return availableBooks;
    }
}
