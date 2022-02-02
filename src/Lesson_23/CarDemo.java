package Lesson_23;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {
    public static void main(String[] args) {
        Car mazda = new Car("Mazda", 250);
        Car bmw = new Car("BMW", 450);
        Car gtr = new Car("GTR", 650);

        List<Car> auto = new ArrayList<>();
        auto.add(mazda);
        auto.add(bmw);
        auto.add(gtr);
        System.out.println(bmw);
        print(auto);

    }

    public static void print(List<Car> auto) {
        for (Car car: auto) {
            System.out.println(car);

        }
    }

}

//На склад поступили автомобили. Каждый автомобиль имеет марку и мощность двигателя.
// Нужно вывести на экран номенклатуру автомобилей на складе (какие разные автомобили есть на складе).
