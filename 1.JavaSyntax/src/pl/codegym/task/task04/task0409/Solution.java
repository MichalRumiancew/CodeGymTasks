package pl.codegym.task.task04.task0409;

/* 
Najbliżej 10
*/

public class Solution {
    public static void main(String[] args) {
        wyswietlNajblizszaDziesiatce(8, 11);
        wyswietlNajblizszaDziesiatce(7, 14);
    }

    public static void wyswietlNajblizszaDziesiatce(int a, int b) {
        if (abs(a - 10)  <=  abs(b - 10)) {System.out.println(a);}
        else{ System.out.println(b);}

        //System.out.println(abs(a - 10) <= abs(b - 10) ? a : b);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}