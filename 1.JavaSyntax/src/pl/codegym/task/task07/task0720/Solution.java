package pl.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Przestawiono w samą porę
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tekst = reader.readLine();
            lista.add(tekst);
        }
        for (int i = 0; i < m; i++) {
            lista.add(lista.remove(0));

        }
        for (String s : lista) {
            System.out.println(s);

        }
    }
}
