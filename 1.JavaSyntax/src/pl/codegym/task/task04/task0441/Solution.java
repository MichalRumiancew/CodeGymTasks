package pl.codegym.task.task04.task0441;


/* 
Jakiś taki przeciętny
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            System.out.println(a);
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println(b);
        } else if ((c >= a && c <= b) || (c <= a && c >= b)) {
            System.out.println(c);
        }
    }
}
