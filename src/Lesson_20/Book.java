package Lesson_20;

public class Book {
    private String author;
    private String tittle;

    public Book(String author, String tittle) {
        this.author = author;
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", tittle='" + tittle + '\'' +
                '}';
    }
}
