package pl.codegym.task.task04.task0415;

/* 
Zasada trójkąta
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a<c+b) && (b<a+c) && (c<a+b)){
            System.out.println("Da się zbudować trójkąt.");
        }
        else{
            System.out.println("Nie da się zbudować trójkąta.");
        }
    }
}