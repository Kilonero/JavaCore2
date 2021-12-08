package Lesson_14.pr;

public class Pizza extends Food {

    public Pizza(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Мы сьели один кусок " + name);
    }
}
