package library;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "Author A", 2020);
        Book book2 = new Book("978-0-13-110362-7", "Python Programming", "Author B", 2019);

        library.addBook(book1);
        library.addBook(book2);
    }
}


