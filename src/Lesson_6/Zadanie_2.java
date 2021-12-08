package Lesson_6;

public class Zadanie_2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        boolean otr = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                otr = true;

            }

        }
        if (otr) {
            System.out.println("Есть отрицательные");
        } else {
            System.out.println("Нет отрицательных");
        }
    }
}

