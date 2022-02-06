package Lesson_25;

import java.util.Objects;

public class Dog extends Animal {
    private int medals;

    public Dog(String name, int weight, int medals) {
        super(name, weight);
        this.medals = medals;
    }

    public int getMedals() {
        return medals;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", medals=" + medals +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return medals == dog.medals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), medals);
    }
}
