package pl.codegym.task.task04.task0429;

/* 
Liczby dodatnie i ujemne
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int count1 = 0;
        int count2 = 0;


        if (a > 0) {
            count1++;
        }
        if (b > 0) {
            count1++;
        }
        if (c > 0) {
            count1++;
        }
        if (a < 0) {
            count2++;
        }
        if (b < 0) {
            count2++;
        }
        if (c < 0) {
            count2++;
        }
        System.out.println("Liczba liczb ujemnych: " + count2);
        System.out.println("Liczba liczb dodatnich: " + count1);


    }
}
