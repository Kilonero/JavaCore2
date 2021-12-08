package Lesson_7;

public class Zadanie_01 {
    public static void main(String[] args) {
        int[] ne = {12, 34, 45, 56, 67, 89, 90, 12, 36, 57};
        int c = nech(ne);
        System.out.println(c);
    }
    static int nech(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                sum = a[i] + sum;
            }
        }
        return sum;
    }
}
