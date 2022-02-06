package Lesson_23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarDemo {
    public static void main(String[] args) {
        Car mazda = new Car("Mazda", 250);
        Car bmw = new Car("BMW", 450);
        Car gtr = new Car("GTR", 650);
        Car gtr1 = new Car("GTR", 650);

        Set<Car> auto = new HashSet<>();
        auto.add(mazda);
        auto.add(bmw);
        auto.add(gtr);

        System.out.println(bmw);
        System.out.println();

        print(auto);

    }

    public static void print(Set<Car> auto) {
        for (Car car: auto) {
            System.out.println(car);
        }
    }
}

//На склад поступили автомобили. Каждый автомобиль имеет марку и мощность двигателя.
// Нужно вывести на экран номенклатуру автомобилей на складе (какие разные автомобили есть на складе).
