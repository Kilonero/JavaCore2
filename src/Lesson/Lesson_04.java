package Lesson;

public class Lesson_04 {
    public static void main(String[] args) {
        double[]  b = {1.0, 2.0, 4.7};
        double sum = 0.0;
        for (int a = 0; a < 3; a = a + 1) {
            sum = b[a] + sum;
        }
        System.out.println("Сумма " + sum);
    }
}
