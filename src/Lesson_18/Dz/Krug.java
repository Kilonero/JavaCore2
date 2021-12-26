package Lesson_18.Dz;

public class Krug extends Figure {
    private int radius;

    public Krug(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getPloshad() {
        return 3.14 * radius * radius;
    }
}
