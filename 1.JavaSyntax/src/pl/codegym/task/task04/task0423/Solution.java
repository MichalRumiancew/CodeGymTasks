package pl.codegym.task.task04.task0423;

/* 
Strategia ochroniarzy
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();
        int wiek = scanner.nextInt();
        if (wiek>20){
            System.out.println("Wystarczy, że masz 18");
        }
    }
}
