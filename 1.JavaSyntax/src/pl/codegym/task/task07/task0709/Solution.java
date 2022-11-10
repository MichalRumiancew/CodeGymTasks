package pl.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Mów zwięźle
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lista.add(bis.readLine());
        }

        String minSizeElement = lista.get(0);
        for (String element : lista) {
            if (element.length() < minSizeElement.length()) {
                minSizeElement = element;
            }
        }

        for (String element : lista) {
            if (element.length() == minSizeElement.length()) {
                System.out.println(element);
            }
        }
    }
}
