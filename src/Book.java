import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Название  " + this.title + this.author + " год выпуска " + this.publicationYear;

    }

    public boolean equals(Object book1) {
        if (book1 == null) {
            return false;
        }
        if (this.getClass() != book1.getClass()) {
            return false;
        }
        Book book = (Book) book1;

        return title.equals(book.getTitle()) && author.equals(book.getAuthor()) && publicationYear == book.getPublicationYear();
    }

    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}

