package Lesson;

public class MasVo {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        printSum(a, b);
        printSum(10,5);
        printSum(12, 45);
    }

    static void printSum(int x, int g) {
        System.out.println(x + g);
    }
}
