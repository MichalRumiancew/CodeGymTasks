package pl.codegym.task.task08.task0820;
//
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
        wynik.add(new Kot());
        wynik.add(new Kot());
        wynik.add(new Kot());
        wynik.add(new Kot());

        //tutaj wpisz swój kod

        return wynik;
    }

    public static Set<Pies> utworzPsy() {
        HashSet<Pies> wynik = new HashSet<Pies>();
        wynik.add(new Pies());
        wynik.add(new Pies());
        wynik.add(new Pies());

        return wynik;
    }

    public static Set<Object> dolacz(Set<Kot> koty, Set<Pies> psy) {
        HashSet set = new HashSet();
        set.addAll(koty);
        set.addAll(psy);
        return set;
    }

    public static void usunKoty(Set<Object> zwierzeta, Set<Kot> koty) {
        zwierzeta.removeAll(koty);
    }

    public static void printZwierzeta(Set<Object> zwierzeta) {
        for (Object pet : zwierzeta){
            System.out.println(pet);
        }
    }

    public static class Kot{

    }
    public static class Pies{

    }
}
