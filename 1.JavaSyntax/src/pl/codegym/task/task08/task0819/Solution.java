package pl.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Koci Set
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        koty.remove(koty.toArray()[0]);
        printKoty(koty);
    }

    public static Set<Kot> utworzKoty() {
        HashSet<Kot> result = new HashSet<>();
        result.add(new Kot());
        result.add(new Kot());
        result.add(new Kot());
        return result;
    }

    public static void printKoty(Set<Kot> koty) {
        for (Kot kot : koty) {
            System.out.println(kot);
        }
    }

    public static class Kot{

    }
}
