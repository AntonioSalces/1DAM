package library;
import java.util.ArrayList;
import java.util.HashMap;
import library.exceptions.*;

/**
 * Implementación de una biblioteca que gestiona una colección de libros.
 * Utiliza un catálogo para almacenar los libros y un HashMap para acceso rápido por autor.
 */
public class Library implements ILibrary {
    private Catalog<Book> books;
    private HashMap<String, ArrayList<Book>> authorBooks;
    private HashMap<Integer, ArrayList<Book>> years;

    public Library (){
        books = new Catalog<>();
        authorBooks = new HashMap<>();
    }

    @Override
    public void addBook(Book book) throws DuplicateBookException {
        if (books.getAllItems().contains(book)) {
            throw new DuplicateBookException(book.getIsbn());
        } else {
            if (book != null) {
                books.addItem(book);
            }
            for (Book bookFor : books.getAllItems()) {
                if (bookFor != null) {
                    if (bookFor.getAuthor().equals(book.getAuthor())) {
                        if (!authorBooks.containsKey(book.getAuthor())) {
                            authorBooks.put(book.getAuthor(), authorBooks.get(book.getAuthor()));
                        } else {
                            authorBooks.get(book.getAuthor());
                        }
                    }
                    if (bookFor.getPublicationYear() == book.getPublicationYear()) {
                        /*if (!years.containsKey(book.publicationYear) && years != null) {
                            years.put(book.publicationYear, authorBooks.get(book.getAuthor()));
                        } else {
                            years.get(book.getPublicationYear());
                        }*/
                    }
                } else {
                    throw new DuplicateBookException(book.getIsbn());
                }
            }
        }
    }

    @Override
    public void removeBook(String isbn) throws BookNotFoundException {
        for (Book bookFor : books.getAllItems()) {
            if (bookFor.getIsbn().equals(isbn) && bookFor != null) {
                books.removeItem(bookFor);
                authorBooks.get(bookFor.getAuthor());
            }
        }
    }

    @Override
    public Book findByIsbn(String isbn) throws BookNotFoundException {
        Book ret = new Book(isbn, isbn, isbn, 0);
        for (Book aux : books.getAllItems()) {
            if (isbn == aux.getIsbn()) {
                aux = ret;
            }
        }
        if (ret == new Book(isbn, isbn, isbn, 0)) {
            throw new BookNotFoundException(isbn);
        } else {
            return ret;
        }
    }

    @Override
    public ArrayList<Book> findByAuthor(String author) {
            return authorBooks.get(author);
    }

    @Override
    public ArrayList<Book> findByYear(int year) {
            return years.get(year);
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> copy = books.getAllItems();
        return copy;
    }

} 