package Lesson_7;

public class Zadanie_02 {
    public static void main(String[] args) {
        int[] vse = {12, 34, 56, 67, 78, 90, 23, 45, 67, 78};
        int[] c = obshae(vse);
        System.out.println(c[0]);
        System.out.println(c[1]);

    }
    static int[] obshae(int[] a) {
        int sumchet = 0;
        int sumnech = 0;
        for (int i = 0; i < a.length; i++) {

            if (i % 2 == 0) {
                sumchet = sumchet + a[i];
            } else {
                sumnech = sumnech + a[i];
            }
        }
        int[] result = new int[2];
        result[0] = sumchet;
        result[1] = sumnech;
        return result;
    }


}
