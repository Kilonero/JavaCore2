package Lesson_14.pr;

public class Cola extends Food {

    public Cola(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Мы выпили один глоток " + name);
    }
}
