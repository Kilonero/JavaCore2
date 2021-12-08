package Lesson_10_books;

public class Book {
    String name;
    String autor;
    int page;

    Book(String name, String autor, int page) {
        this.name = name;
        this.autor = autor;
        this.page = page;
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ",page=" + page +
                "}";
    }


}

