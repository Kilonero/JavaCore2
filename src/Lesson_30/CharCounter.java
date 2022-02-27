package Lesson_30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * считаем символы и буквы в файле
 */
public class CharCounter {
    public static void main(String[] args) {
        String fileName = "in.txt";
        Map<String,Integer> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            while (reader.ready()) {
                String line = reader.readLine();
                String[] symbols = line.split("");

                for (String symbol : symbols) {
                    Integer count = map.getOrDefault(symbol, 0);
                    map.put(symbol, count + 1);
                }
            }

        } catch (IOException e) {
            System.err.println();
            System.exit(1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}