package pl.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Tablica z ciągami w odwrotnej kolejności
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        String[] tablica = new String[10];
            for (int i = 0; i < 8; i++) {
                tablica[i] = bis.readLine();
            }
            for (int j = 9; j >= 0; j--) {
                System.out.println(tablica[j]);

            }
        }
    }
