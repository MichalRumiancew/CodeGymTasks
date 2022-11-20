package pl.codegym.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 wyrazów, które zaczynają się na literę „L”
*/

public class Solution {
    public static Set<String> utworzSet() {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("L" + String.valueOf(i));

        }
        return set;

    }

    public static void main(String[] args) {

    }
}
