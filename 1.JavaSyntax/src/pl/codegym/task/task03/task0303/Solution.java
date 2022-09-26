package pl.codegym.task.task03.task0303;

/* 
Wymiana walut
*/

public class Solution {
    public static void main(String[] args) {
        double value1 = konwertujEurNaUsd(100,4.56);
        double value2 = konwertujEurNaUsd(400, 1.24);
        System.out.println(value1);
        System.out.println(value2);
    }

    public static double konwertujEurNaUsd(int eur, double kursWymiany) {
        return eur * kursWymiany;
    }
}
