package Lesson_26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumbersCount {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        printNumbersCount(numbers);


    }

    private static void printNumbersCount(List<Integer> numbers) {
        Map<Integer, Integer> numberToCount = new HashMap<>();
        for (Integer number : numbers) {
             //Integer integerCount = numberToCount.get(number);
             //int count = integerCount != null ? integerCount : 0;
            int count = numberToCount.getOrDefault(number, 0);

            numberToCount.put(number, count +1);

        }

        print(numberToCount);

    }

    private static void print(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

    }
}
