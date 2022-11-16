package pl.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Koniec
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String tekst = reader.readLine();
            if (tekst.equals("koniec")) {
                break;
            }
            lista.add(tekst);
        }

        for (String s : lista) {
            System.out.println(s);
        }
    }
}