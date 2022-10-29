import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private int yearOfThePublication;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author.getName()+" "+author.getSurname();
        this.yearOfThePublication = year;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearOfThePublication() {
        return this.yearOfThePublication;
    }

    public void setYearOfThePublication(int year) {
        this.yearOfThePublication = year;
    }

    @Override
    public String toString() {
        return this.getAuthor()+": "+this.getName()+": "+this.getYearOfThePublication();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfThePublication == book.yearOfThePublication && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfThePublication);
    }
}
