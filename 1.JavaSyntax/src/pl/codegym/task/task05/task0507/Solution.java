package pl.codegym.task.task05.task0507;

/* 
Średnia arytmetyczna
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;
        double sum = 0;
        while (true) {
            int a = scanner.nextInt();
            if (a == -1) {
                System.out.println(sum / liczba);
                return;
            }
            liczba++;
            sum = +a;
        }
    }
}


//    BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
//
//    double sum = 0;
//    int liczba = 0;
//        while (true) {
//                int a = Integer.parseInt(bis.readLine());
//
//                if (a == -1) {
//                System.out.println(sum / liczba);
//                return;
//                }
//                liczba++;
//                sum += a;
//                }
//                }
//                }
