package dzi.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int i = Integer.parseInt(str);
        if (i < 0) {
            i = Math.abs(i);

        }
        System.out.println(i);
    }
}
