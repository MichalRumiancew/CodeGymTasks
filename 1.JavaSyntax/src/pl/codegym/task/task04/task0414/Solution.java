package pl.codegym.task.task04.task0414;

/* 
Liczba dni w roku
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int rok = scanner.nextInt();
        int dni;
        if (rok % 4 == 0) {
            if ((rok % 100 == 0) && (rok % 400 != 0)) {
                dni = 365;
            } else {
                dni = 366;
            }
        } else {
            dni = 365;
        }

        System.out.println("Liczba dni w roku: " + dni);
    }
}