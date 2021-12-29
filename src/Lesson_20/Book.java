package Lesson_20;

public class Book implements Comparable<Book> {
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

    @Override
    public int compareTo(Book book) {
        int result;
        if (this.getAuthor().compareTo(book.getAuthor()) > 0) {
            result = 1;
        } else if (this.getAuthor().compareTo(book.getAuthor()) < 0) {
            result = -1;
        } else {
            result = this.getTittle().compareTo(book.getTittle());
        }
        return result;
    }
}
