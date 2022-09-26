package pl.codegym.task.task03.task0307;

/* 
Witaj, StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.imie = "z1";
        zerg2.imie = "z2";
        zerg3.imie = "z3";
        zerg4.imie = "z4";
        zerg5.imie = "z5";

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        protoss1.imie = "p1";
        protoss2.imie = "p2";
        protoss3.imie = "p3";

        Terranin terranin1 = new Terranin();
        Terranin terranin2 = new Terranin();
        Terranin terranin3 = new Terranin();
        Terranin terranin4 = new Terranin();
        terranin1.imie = "t1";
        terranin2.imie = "t2";
        terranin3.imie = "t3";
        terranin4.imie = "t4";

    }

    public static class Zerg {
        public String imie;
    }

    public static class Protoss {
        public String imie;
    }

    public static class Terranin {
        public String imie;
    }
}
/*
Witaj, StarCraft!
Utwórz 5 jednostek Zerg, 3 jednostki Protoss i 4 jednostki Terran.
Nadaj im wszystkim unikalne nazwy.


Requirements:
1. Nie zmieniaj klas Zerg, Protoss i Terranin.
2. Utwórz 5 obiektów Zerg i nazwij każdy z nich.
3. Utwórz 3 obiekty Protoss i nazwij każdy z nich.
4. Utwórz 4 obiekty Terranin i nazwij każdy z nich.
 */