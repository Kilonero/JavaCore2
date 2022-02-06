package Lesson_25;

import java.util.ArrayList;
import java.util.List;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat liloo = new Cat("Liloo", 5, true);
        Dog gabi = new Dog("Gabi", 65, 3);
        Cat bony = new Cat("Bony", 6, false);
        Dog rex = new Dog("Rex", 45, 2);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(gabi);
        dogs.add(rex);

        List<Cat> cats = new ArrayList<>();
        cats.add(liloo);
        cats.add(bony);

        List<Animal> animals = new ArrayList<>();
        animals.add(liloo);
        animals.add(gabi);
        animals.add(bony);
        animals.add(rex);

        print(animals);
        System.out.println();
        print(gabi);
        print(bony);
        System.out.println();
        print(cats);
        System.out.println();
        print(dogs);

    }

    private static void print(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);

        }
    }

    private static void print(Animal animal) {
        System.out.println(animal);
    }
}
