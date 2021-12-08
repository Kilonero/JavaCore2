package Lesson_6;

public class Praktika_5 {
    public static void main(String[] args) {
        int[] ned = {10, 22, 34, 45, 55, 66};
        int c = nech(ned);
        System.out.println(c);
    }
    static int nech(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i%2 == 0) {
                sum = a[i] + sum;
            }
        }
        return sum;
    }
}
