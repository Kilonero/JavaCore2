package Lesson_18.Dz;

public class Kvadrat extends Figure {
    private int storona;


    public Kvadrat(int storona) {
        this.storona = storona;
    }


    @Override
    public double getPloshad() {
        return storona * storona;
    }

    public int getStorona() {
        return storona;
    }
}
