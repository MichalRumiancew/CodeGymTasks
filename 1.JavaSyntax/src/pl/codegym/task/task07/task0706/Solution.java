package pl.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ulice i domy
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int[] tablica = new int[15];
        for (int i = 0; i < 15; i++) {
            tablica[i] = Integer.parseInt(bis.readLine());
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                sum1 += tablica[i];
            } else {
                sum2 += tablica[i];
            }
        }

        if (sum1 > sum2) {
            System.out.println("Więcej ludzi mieszka w domach o parzystych numerach.");
        } else if (sum2 > sum1) {
            System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach.");
        }
    }
}
