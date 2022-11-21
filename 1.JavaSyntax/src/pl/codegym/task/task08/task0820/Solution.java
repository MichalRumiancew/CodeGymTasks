package pl.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Zwierzęcy secik
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        Set<Pies> psy = utworzPsy();

        Set<Object> zwierzeta = dolacz(koty, psy);
        printZwierzeta(zwierzeta);

        usunKoty(zwierzeta, koty);
        printZwierzeta(zwierzeta);
    }

    public static Set<Kot> utworzKoty() {
        HashSet<Kot> wynik = new HashSet<Kot>();

        //tutaj wpisz swój kod

        return wynik;
    }

    public static Set<Pies> utworzPsy() {
        //tutaj wpisz swój kod
        return null;
    }

    public static Set<Object> dolacz(Set<Kot> koty, Set<Pies> psy) {
        //tutaj wpisz swój kod
        return null;
    }

    public static void usunKoty(Set<Object> zwierzeta, Set<Kot> koty) {
        //tutaj wpisz swój kod
    }

    public static void printZwierzeta(Set<Object> zwierzeta) {
        //tutaj wpisz swój kod
    }

    //tutaj wpisz swój kod
}
