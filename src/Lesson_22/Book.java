package Lesson_22;

public class Book {
    private String name;
    private String number;

    public Book(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
