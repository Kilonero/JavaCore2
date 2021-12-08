package Lesson_8;

public class Lesson09 {
    public static void main(String[] args) {
        Person ivan = new Person();
        ivan.name = "Ivan";
        ivan.age = 25;
        Person petr = new Person();
        petr.name = "Petr";
        petr.age = 30;
        printPerson(ivan);
        printPerson(petr);


    }
    static void printPerson(Person person) {
        System.out.println(person.name + " , " + person.age);
    }

}

