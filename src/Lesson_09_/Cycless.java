package Lesson_09_;

public class Cycless {

    public static void main(String[] args) {
        int[] a = {1, -2, 3, -4, 5};
        int[] c = otrPol(a);
        System.out.println(c[0]);
        System.out.println(c[1]);

    }

    static int[] otrPol(int[] x) {
        int pol = 0;
        int otr = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                pol = pol + x[i];
            }
            if (x[i] < 0) {
                otr = otr + x[i];
            }
        }
        int[] result = new int[2];
        result[0] = pol;
        result[1] = otr;
        return result;
    }
}










