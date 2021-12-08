package Lesson;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        int[] a = new int[4];


        for (int i = 0; i < 4; i++) {
            System.out.print("Введите " + i + "-й элемент массива: ");
            String elementAsString = reader.readLine();
            int element = Integer.parseInt(elementAsString);
            a[i] = element;
        }
        int sum = 0;
        for (int i = 0; i  < 4; i++) {
            sum = sum + a[i];
        }
        System.out.println("Сумма = " + sum);

          }
        }

