package Lesson_6;

public class Praktika_4 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = new int [a.length / 2];
        System.out.println("Длина массива a = " + a.length);
        System.out.println("Начальное состояние массива: a");
        for (int i = 0; i < a.length; i = i + 1) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        {
            System.out.println("Массивы а стоящие на не четных позициях");
            for (int i = 0; i < a.length; i = i + 1) {
                if (a[i] % 2 <= 0) {

                    System.out.print(a[i] + " ");

                }
            }
        }
    }
}

