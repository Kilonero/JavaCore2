package Lesson_25;

import java.util.Objects;

public class Cat extends Animal {

    private boolean bare;

    public Cat(String name, int weight, boolean bare) {
        super(name, weight);
        this.bare = bare;
    }

    public boolean isBare() {
        return bare;
    }

    public void setBare(boolean bare) {
        this.bare = bare;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", bare=" + bare +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return bare == cat.bare;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bare);
    }
}
