package library;
/**
 * Clase que representa un libro en la biblioteca.
 * Contiene la información básica de un libro: título, autor, ISBN y año de publicación.
 * Dos libros se consideran iguales si tienen el mismo ISBN.
 */
public class Book implements IBook {
    private String title;
    private String author;
    private String isbn;
    public int publicationYear;

    public Book(String title, String author, String isbn, int publicationYear) {
        if ((title.equals(null)) || (author.equals(null)) || (isbn.equals(null))) {
            throw new IllegalArgumentException("Ningún campo puede ser null");
        } else {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.publicationYear = publicationYear;
        }
        
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }

    @Override
    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass() || obj == null) {
            return false;
        }
        Book book = (Book) obj;
        return (this.isbn == book.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', isbn='%s', publicationYear='%d'}",
        title, author, isbn, publicationYear);
    }
} 