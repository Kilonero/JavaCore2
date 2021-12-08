package Lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les_01 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numAsString = reader.readLine();
        // num = number
        int number = Integer.parseInt(numAsString);

        if (number <= 2) {
            if (number >= 1) {

                System.out.println(number + " - в границвх [1,2]");
            } else {
                System.out.println(number + " - меньше 1");
            }
        } else {
            System.out.println(number + " - больше 2");






        }
    }
}