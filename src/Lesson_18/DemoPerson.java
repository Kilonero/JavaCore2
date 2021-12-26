package Lesson_18;

import java.util.ArrayList;
import java.util.List;

public class DemoPerson {
    public static void main(String[] args) {
        Person ivan = new Student("Ivan", 23, 7);
        Person dima = new Student("Dima", 28, 8);
        Person anton = new Student("Anton", 20, 9);

        Person marry = new Teacher("Marry", 45, null);
        Person dasha = new Teacher("Dariya", 35, "da");

        List<Person> personal = new ArrayList<>();
        personal.add(ivan);
        personal.add(dima);
        personal.add(anton);
        personal.add(marry);
        personal.add(dasha);


        for (int i = 0; i < personal.size(); i++) {
            Person person = personal.get(i);
            if (person instanceof Teacher && ((Teacher) person).getZvanie() != null) {
                System.out.println(person);
            }



        }

    }
}
