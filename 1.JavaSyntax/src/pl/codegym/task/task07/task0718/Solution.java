package pl.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Sprawdzanie kolejności
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            lista.add(s);
        }

        String minElement = lista.get(0);

        for (int i = 1; i < 10; i++) {
            if (lista.get(i).length() >= minElement.length()) {
                minElement = lista.get(i);
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}
