package Lesson_22;

import java.util.ArrayList;
import java.util.List;

public class DemoBook {
    public static void main(String[] args) {
        Book anton = new Book("Anton", "+3751234567");
        Book dima = new Book("Dima", "+3751234568");
        Book pasha = new Book("Pasha", "+3751234569");

        List<Book> people = new ArrayList<>();
        people.add(anton);
        people.add(dima);
        people.add(pasha);

        print(people);

    }
    private static void print(List<Book> people) {
        for (Book person : people) {
            System.out.println(person);

        }


    }
}
