package Lesson;

public class Lesson_02 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, -5, -6, -7, 8};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                count++;
            }
        }
        System.out.println("Кол-во отр элементов: " + count);
    }
}

