package pl.codegym.task.task07.task0715;

import java.util.ArrayList;/*
Więcej Ala ma kota
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String a1 = "Ala";
        String a2 = "ma";
        String a3 = "kota";
        String a4 = "As";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);

        lista.add(1, a4);
        lista.add(3, a4);
        lista.add(5, a4);
        for (String a : lista) {
            System.out.println(a);
        }
    }
}
