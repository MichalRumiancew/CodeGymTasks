package pl.codegym.task.task04.task0437;


/* 
Trójkąt z ósemek
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        int m = 10;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('8');
            }

            System.out.println();
        }
    }
}