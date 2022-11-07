package pl.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Samotne tablice oddziałują na siebie
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String[] tablica = new String[10];
        int[] tablica2 = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = bis.readLine();
            tablica2[i] = tablica[i].length();

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(tablica2[i]);

        }
    }
}