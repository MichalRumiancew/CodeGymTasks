package pl.codegym.task.task03.task0312;

/* 
Konwersja czasu
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(konwertujNaSekundy(10));
        System.out.println(konwertujNaSekundy(11));
    }
    public static int konwertujNaSekundy(int godzina) {
        return godzina * 60 * 60;
    }
}
