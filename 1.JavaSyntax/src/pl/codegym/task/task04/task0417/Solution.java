package pl.codegym.task.task04.task0417;

/* 
Masz parę?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && a == c) {
            System.out.println(a + " " + b + " " + c);
        } else {
            if (a == b) {
                System.out.println(a + " " + b);
            }
            if (a == c) {
                System.out.println(a + " " + c);
            }
            if (b == c) {
                System.out.println(b + " " + c);
            }
        }
    }
}