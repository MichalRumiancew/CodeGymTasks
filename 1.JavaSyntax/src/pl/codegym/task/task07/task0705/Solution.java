package pl.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Jedna wielka tablica i dwie małe
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int[] tablica = new int[20];
        for (int i = 0; i < 20; i++) {
            tablica[i] = Integer.parseInt(bis.readLine());
        }
        int[] tablica1 = new int[10];
        int[] tablica2 = new int[10];
        for (int i = 0; i < 10; i++) {
            tablica1[i] = tablica[i];
            tablica2[i] = tablica[i + 10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(tablica2[i]);
        }
    }
}
