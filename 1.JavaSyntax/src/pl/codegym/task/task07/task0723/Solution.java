package pl.codegym.task.task07.task0723;

/*
Odliczanie
*/

public class Solution {

    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
        }

        System.out.println("Bum!");
    }
}

