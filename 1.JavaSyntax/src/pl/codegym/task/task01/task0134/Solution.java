package pl.codegym.task.task01.task0134;

/* 
Napełnij basen wodą
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjetosc(25, 5, 2));
    }

    public static long getObjetosc(int a, int b, int c) {
        long result = a * b * c;
        return result * 1000;
        //   rozwiązanie inne 1000L L-od razu zamieni na long * 1000 bo w litrach
        //   public static long getObjetosc(int a, int b, int c) {
        //        return 1000L * a * b * c;
    }
}