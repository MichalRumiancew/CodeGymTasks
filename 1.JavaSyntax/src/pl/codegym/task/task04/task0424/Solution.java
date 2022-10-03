package pl.codegym.task.task04.task0424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
Trzy liczby
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bis.readLine());
        int b = Integer.parseInt(bis.readLine());
        int c = Integer.parseInt(bis.readLine());
        if (a == b && a == c && b == c) {
        } else {
            if (a == b) {
                System.out.println(3);
            } else {
                if (b == c) {
                    System.out.println(1);
                } else if (a == c) {
                    System.out.println(2);
                }
            }
        }
    }
}

