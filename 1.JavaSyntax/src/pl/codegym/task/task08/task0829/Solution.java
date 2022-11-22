package pl.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Aktualizacja oprogramowania
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Lista adresów
        HashMap<String, String> adresy = new HashMap<>();
        while (true) {
            String rodzina = reader.readLine();
            if (rodzina.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            adresy.put(rodzina, family);
        }

        // Wczytuje numer domu
        String numerDomu = reader.readLine();

        if (adresy.containsKey(numerDomu)) {
            String nazwiskoRodziny = adresy.get(numerDomu);
            System.out.println(nazwiskoRodziny);
        }
    }
}
