package Lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson_01_1 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число a: ");
        String aAsString = reader.readLine();
        int a = Integer.parseInt(aAsString);

        System.out.print("Введите число b: ");
        String bAsString = reader.readLine();
        int b = Integer.parseInt(bAsString);

        System.out.print("Введите число c: ");
        String cAsString = reader.readLine();
        int c = Integer.parseInt(cAsString);

        if ( a > b && a > c) {
            System.out.println(" max a = " + a );
        } else if ( b > a && b > c ) {
            System.out.println(" max b = " + b );
        } else {
            System.out.println(" max c = " + c );
        }


    }
}
