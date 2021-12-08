package Lesson_4;

public class Les_1 {
    public static void main(String[] args) {
        int[] a = {1, 2, -3, -4, -5, 6};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
            count++;
            }
        }
        System.out.println("кол-во отрицательных эл-ов: " + count);
    }
}

