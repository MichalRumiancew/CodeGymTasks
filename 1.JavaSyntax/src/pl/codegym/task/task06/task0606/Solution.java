package pl.codegym.task.task06.task0606;

import java.io.IOException;
import java.util.Scanner;

/* 
Cyfry parzyste i nieparzyste
*/

public class Solution {

    public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        while (count > 0) {
            if (count % 2 == 0) {
                parzyste++;
            } else {
                nieparzyste++;
            }
            count = count / 10;
        }
        System.out.println("Parzyste: " + parzyste + " Nieparzyste: " + nieparzyste);
    }
}
