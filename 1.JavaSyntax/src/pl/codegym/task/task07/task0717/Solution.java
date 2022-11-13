package pl.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplikowanie słów
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            lista.add(s);
        }

        ArrayList<String> wynik = doubleValues(lista);

        for (String s : wynik) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> lista) {
        ArrayList<String> wynik = new ArrayList<>();
        for (String s : lista) {
            wynik.add(s);
            wynik.add(s);
        }
        return wynik;
    }
}
