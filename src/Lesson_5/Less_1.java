package Lesson_5;

public class Less_1 {
    public static void main(String[] args) {
        int[] ishodny1 = {1, 2, 3, 6};
        int[] ishodny2 = {1, 2, 3, 4, 5};
        printMassive(ishodny1);
        printMassive(ishodny2);

    }

    static void printMassive(int[] massive) {
        int sum = 0;
        for (int i = 0; i < massive.length; i++) {
            sum = sum + massive[i];
        }
        System.out.println((double)sum / massive.length);
    }
}















