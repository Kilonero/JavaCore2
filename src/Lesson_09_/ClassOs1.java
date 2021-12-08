package Lesson_09_;

public class ClassOs1 {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 25);
        Person petr = new Person("Petr", 17);
        Person koly = new Person("Koly", 26);
        Person dima = new Person("Dima", 28);
        Person pasha = new Person("Pasha", 16);
        Person[] persons = {ivan, petr, koly, dima, pasha};
        int count = printPerson(persons);

        System.out.println(count);

    }
        static int printPerson(Person[] pepole) {
        int count = 0;
        for (int i = 0; i < pepole.length; i++) {
            if (pepole[i].age > 18) {
                count++;
            }
        }
        return count++;
    }
}
