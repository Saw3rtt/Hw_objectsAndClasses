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
        // Добавляем метод toString()
        return "Название  " + this.title + this.author + " год выпуска " + this.publicationYear;
        // Возвращаем строку в метод Main
    }

    public boolean equals(Book book1) {
        return title.equals(book1.getTitle()) && author.equals(book1.getAuthor());
    }

    public int hashCode() {
        return Objects.hash(title, author , publicationYear);
    }
}

