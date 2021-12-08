package Lesson_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie_03 {
    public static void main(String[] args) throws IOException {
        int[] ints = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ints.length; i++) {
            String intAsString = reader.readLine();
            ints[i] = Integer.parseInt(intAsString);
        }
        String intAsString = reader.readLine();
        int x = Integer.parseInt(intAsString);
        printmetod(ints, x);
    }
    static void printmetod(int[] array, int  diget) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == diget) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Число " + diget + " содержиться в массиве");
        } else {
            System.out.println("Число " + diget + " не содержиться в массиве");
        }
    }
}










