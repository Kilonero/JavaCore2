package Lesson_09_;

public class MassiveStroc {
    public static void main(String[] args) {
        String[] mass = {"Never", "give", "up"};

        for (int i = 0; i < mass.length; i++) {
            mass[i] = String.valueOf(mass[i].length());
        System.out.print(mass[i] + " ");
        }
    }
}

