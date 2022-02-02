package Lesson_24;

public class HomeDemo {
    public static void main(String[] args) {
        Home home = new Home();

        home.settle(14, "Petrov");
        home.settle(13, "Ivanov");
        System.out.println(home);
        System.out.println(home.isEmpty(14));

        home.evict(14);
        System.out.println(home);
        System.out.println(home.count());
        System.out.println(home.who(13));
    }
}
