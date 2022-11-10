package pl.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
Co to za rodzaj listy?
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        ArrayList<String> lista = new ArrayList<>();
        lista.add("Matka1");
        lista.add("Matka1");
        lista.add("Matka1");
        lista.add("Matka1");
        lista.add("Matka1");

        System.out.println(lista.size());
        for (String s : lista) {
            System.out.println(s);
        }
    }
}
