package pl.codegym.task.task04.task0443;


/* 
Imię to imię
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        int rrrr = scanner.nextInt();

        int mm = scanner.nextInt();

        int dd = scanner.nextInt();
        System.out.println("Mam na imię "+ name +".");
        System.out.println("Urodziłem/am się " + mm + "/" + dd + "/" + rrrr);
    }
}
