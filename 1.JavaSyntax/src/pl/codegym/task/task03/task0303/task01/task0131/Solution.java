package pl.codegym.task.task03.task0303.task01.task0131;

/* 
Więcej konwersji
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getStopyZCali(243));
    }

    public static int getStopyZCali(int cale) {
        int stopy = cale / 12;
        return stopy;
    }
}