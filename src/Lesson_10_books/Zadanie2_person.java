package Lesson_10_books;

public class Zadanie2_person {
    String name;
    int age;

    Zadanie2_person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    boolean isAdult() {
        boolean check = false;
        if (age >= 18) {
            check = true;
        }
        return check;
    }
}





