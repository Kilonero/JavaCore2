package Lesson_4;

public class Les_3 {
    public static void main(String[] args) {
        int[] a = {-1, 2, 8, 4, -5, 6};
                 // 0  1  2  3   4  5
        int sum = 1;
        for (int i = 1; i < a.length; i = i + 2) {
            if (a[i] % 2 <= 0) {
                sum = a[i] * sum;

            }
        }
        System.out.println(sum);
    }
}
