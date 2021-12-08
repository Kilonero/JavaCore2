package Lesson_12;

public class Auto {
    private String name;
    private int speed;

    public Auto() {
    }

    public Auto(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString() {
        return "Автомобиль: " + name + " скорость: " + speed;
    }

    public void gaz() {
        speed = speed + 10;
    }

    public  void tormoz() {
        speed = speed - 10;
    }


}
