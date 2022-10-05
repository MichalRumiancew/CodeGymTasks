package pl.codegym.task.task04.task0427;

/* 
Opisywanie liczb
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0 && a < 10 && a % 2 == 0) {
            System.out.println("parzysta liczba jednocyfrowa");
        } else if (a > 9 && a < 100 && a % 2 == 0) {
            System.out.println("parzysta liczba dwucyfrowa");
        } else if (a > 99 && a < 1000 && a % 2 == 0) {
            System.out.println("parzysta liczba trzycyfrowa");
        } else if (a > 0 && a < 10 && a % 2 != 0) {
            System.out.println("nieparzysta liczba jednocyfrowa");
        } else if (a > 9 && a < 100 && a % 2 != 0) {
            System.out.println("nieparzysta liczba dwucyfrowa");
        } else if (a > 99 && a < 1000 && a % 2 != 0) {
            System.out.println("nieparzysta liczba trzycyfrowa");
        }

    }
}
