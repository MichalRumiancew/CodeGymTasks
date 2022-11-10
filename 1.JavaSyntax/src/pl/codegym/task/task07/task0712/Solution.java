package pl.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Najkrótszy czy najdłuższy
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = bis.readLine();
            lista.add(s);
        }

        String minSizeElement = lista.get(0);
        int posMinElement = 0;
        String maxSizeElement = lista.get(0);
        int posMaxElement = 0;
        for (int i = 0; i < 10; i++) {
            if (lista.get(i).length() < minSizeElement.length()) {
                minSizeElement = lista.get(i);
                posMinElement = i;
            } else if (lista.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = lista.get(i);
                posMaxElement = i;
            }
        }

        if (posMinElement < posMaxElement) {
            System.out.println(minSizeElement);
        } else if (posMaxElement < posMinElement) {
            System.out.println(maxSizeElement);
        }
    }
}
