package Lesson_13;

public class UvlaghnitelDemo {
    public static void main(String[] args) {
        Uvlaghnitel beko = new Uvlaghnitel("Beko");
        System.out.println(beko);
        beko.turnOn();
        System.out.println(beko);
        beko.nalitVodi();
        System.out.println(beko);
        beko.turnOn();
        System.out.println(beko);

    }
}
