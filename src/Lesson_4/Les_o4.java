package Lesson_4;

public class Les_o4 {
    public static void main(String[] args) {
        int[] a = {7, 2, 8, 4, 5};
        int[] b = {6, 1, 7, 3, 4};
        System.out.println("Длина массива b = " + b.length);
        System.out.println("Начальное состояние массива b");
        for (int i = 0; i < b.length; i = i + 1) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i = i + 1) {
            b[i] = a[i];
        }
        System.out.println("Состояние массива b после копирования");
        for (int i = 0; i < b.length; i = i + 1) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

    }
}
