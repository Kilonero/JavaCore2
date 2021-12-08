package Lesson_09_;

public class MassiveStroc2_1 {
    public static void main(String[] args) {
        String[] mass = {"Never", "give", "up"};
        int[] mas = stringArray(mass);
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");

        }
    }
    static int[] stringArray(String[] m) {
        int[] lengthArray = new int[m.length];
        for (int i = 0; i < lengthArray.length; i++) {
            lengthArray[i] = m[i].length();

        }
        return lengthArray;
    }
}
