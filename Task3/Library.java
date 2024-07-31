//Question1

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        System.out.println("Adding book with ID: " + book.getBookID());
        books.add(book);
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == bookID) {
                books.remove(i);
                break;
            }
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println("Book ID: " + book.getBookID());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Available: " + book.isAvailable());
                System.out.println("---------------------------");
            }
        }
    }

    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    public void replaceBook(int bookID, Book newBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == bookID) {
                books.set(i, newBook);
                break;
            }
        }
    }

}
