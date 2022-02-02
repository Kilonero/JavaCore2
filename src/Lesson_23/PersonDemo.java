package Lesson_23;

import java.util.ArrayList;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        Person dima = new Person("Dima", 1500);
        Person pasha = new Person("Pasha", 1000);
        Person vitia = new Person("Vitia", 500);

        List<Person> people = new ArrayList<>();
        people.add(dima);
        people.add(pasha);
        people.add(vitia);

        //print(people);
        Person foundPerson = findByName(people, "Pasha");
        String result = (foundPerson != null) ? "Зарплата " + foundPerson.getSalary() : "Не найдено";
        System.out.println(result);
        //if (foundPerson != null) {
        //    System.out.println("Зарплата " + foundPerson.getSalary());
        //} else {
          //  System.out.println("Не найдено");
        //}
    }

    public static void print(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static Person findByName(List<Person> people, String name) {
        Person result = null;
        for (Person person : people) {
            if (person.getName().equals(name)) {
                result = person;
            }
        }
        return result;
    }

}
