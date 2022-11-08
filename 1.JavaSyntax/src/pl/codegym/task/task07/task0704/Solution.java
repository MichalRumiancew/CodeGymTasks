package pl.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Odwróć tablicę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int[] tablica = new int[10];
        for (int i = 0; i < 10; i++) {
            tablica[i] = Integer.parseInt(bis.readLine());
        }
        int n = tablica.length;
        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;
            int temp = tablica[i];
            tablica[i] = tablica[j];
            tablica[j] = temp;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(tablica[i]);
        }

    }

}
