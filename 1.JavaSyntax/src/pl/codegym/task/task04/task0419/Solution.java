package pl.codegym.task.task04.task0419;

/* 
Największa z czterech liczb
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a >= b && a >= c && a >= d)
            System.out.println(a);
        else if (b > a && b >= c && b >= d)
            System.out.println(b);
        else if (c >= a && c >= b && c >= d)
            System.out.println(c);
        else if (d > a && d > c && d > b)
            System.out.println(d);


    }
}
//    int max1 = a > b ? a : b;
//    int max2 = c > d ? c : d;
//    int max = max1 > max2 ? max1 : max2;
//        System.out.println(max);