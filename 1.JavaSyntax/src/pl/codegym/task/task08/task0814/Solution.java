package pl.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Random;

/* 
Większa niż 10? Wcale do nas nie pasujesz!
*/

public class Solution {
    public static HashSet<Integer> utworzSet() {
        HashSet<Integer> set = new HashSet<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            set.add(rand.nextInt());

        }
        return set;
    }

    public static HashSet<Integer> usunLiczbyWiekszeNiz10(HashSet<Integer> set) {
        HashSet<Integer> copy = new HashSet<>(set);
        for (Integer n : copy) {
            if (n > 10) {
                set.remove(n);
            }
        }
        return set;

    }

    public static void main(String[] args) {

    }
}
