package pl.codegym.task.task04.task0442;


/* 
Dodawanie
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();
            sum += number;
            if (number == -1) {
                System.out.println(sum);
                return;
            }
        }
    }
}
