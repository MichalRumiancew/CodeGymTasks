package pl.codegym.task.task04.task0412;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        if (liczba > 0){
            System.out.println(liczba*2);
        }
        else if (liczba < 0){
            System.out.println(liczba + 1);
        }
        else System.out.println(liczba);

    }

}
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//
//        if (a > 0) {
//            a = a * 2;
//        } else if (a < 0) {
//            a = a + 1;
//        }
//
//        System.out.println(a);
//    }
//}