package pl.codegym.task.task04.task0432;



/* 
Dobrego nigdy zbyt wiele
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int i = scanner.nextInt();

        while (i > 0) {
            System.out.println(name);
            i--;

        }
    }
}


//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
//        String name = bis.readLine();
//        int i = Integer.parseInt(bis.readLine());
//
//        while (i > 0) {
//            System.out.println(name);
//            i--;
//        }
//    }
//}