package Lesson_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie_3 {
    public static void main(String[] args) throws IOException {
        int[] ints =  new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ints.length; i++) {
            String intAsString = reader.readLine();
            int a = Integer.parseInt(intAsString);
            if(a == 0) {
                System.out.println("Введен ноль");
                break;
            }
        }
    }
}


