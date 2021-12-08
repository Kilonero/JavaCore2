package Lesson_10_books;
public class Zadanie2_1_person {
public static void main(String[]args){

    Zadanie2_person ivan = new Zadanie2_person("Ivan", 26);
    Zadanie2_person koly = new Zadanie2_person("Koly", 27);
    Zadanie2_person pety = new Zadanie2_person("Pety", 25);
    Zadanie2_person dima = new Zadanie2_person("Dima", 28);
    Zadanie2_person artem = new Zadanie2_person("Artem", 17);
    Zadanie2_person[] friends = {ivan, koly, pety, dima, artem};
    int number = adultsCount(friends);
    System.out.println("Кол-во. совершеннолетних " + number);

    }

    static int adultsCount(Zadanie2_person[] people) {
    int counter = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].isAdult()) {
                counter++;
            }
        }
        return counter;


    }

}


