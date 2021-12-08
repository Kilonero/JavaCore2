package Lesson;

public class Les_5 {
    public static void main(String[] args) {
        int[] d = {-1, 3, 18, 23, -24, 15, 7, -8};
        int[] a = new int[8];
        int[] b = new int[8];
        int[] c = new int[8];
        System.out.println("Длина массива d = " + d.length);
        System.out.println("Начальное состояние массива d");
        for (int i = 0; i < d.length; i++) {

            System.out.print(d[i] + " ");
        }
        System.out.println();
        System.out.println("Отрицательные массивы");
        for (int i = 0; i < d.length; i++) {
            if (d[i] < 0) {
                a[i] = d[i];

                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Положительные массивы");
        for (int i = 0; i < d.length; i++) {
            if (d[i] > 0) {
                b[i] = d[i];
                System.out.print(b[i] + " ");

            }
        }
            System.out.println();
            System.out.println("Нулевые массивы" + " ");
            for (int i = 0; i < d.length; i++) {
                System.out.print(c[i] + " ");

            }

        }


    }


















