package pl.codegym.task.task09.task0919;

/* 
Dzielenie przez zero
*/

public class Solution {

    public static void main(String[] args) {
        try {
            dzielimyPrzezZero();
        } catch(Exception e) {
            e.printStackTrace(); // bo ma być wyświetlany ślad stosu
            //System.out.println(e);
        }
    }
        public static void dzielimyPrzezZero() {
        int x = 5 / 0;
        System.out.println(x);
    }
}

