package Lesson_4;

public class Les_2 {
    public static void main(String[] args) {
        int[] a = {-7, 2, -3, -8};
        int count = 0;
        for (int i = 0; i < a.length; i = i + 2) {
            if (a[i] < 0) {
                count++;

            }
        }
        System.out.println("Кол-во отрицательных элементов стоящих на четных позициях: " + count);
    }
}









