package pl.codegym.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;

/* 
Załóż rodzinę
*/

public class Solution {
    public static void main(String[] args) {
        Ludzie c1 = new Ludzie("C1", true, 15);
        Ludzie c2 = new Ludzie("C2", false, 10);
        Ludzie c3 = new Ludzie("C3", true, 5);

        Ludzie f = new Ludzie("F", true, 33, c1, c2, c3);
        Ludzie m = new Ludzie("M", false, 29, c1, c2, c3);

        Ludzie grandF1 = new Ludzie("GF1", true, 69, f);
        Ludzie grandM1 = new Ludzie("GM1", false, 65, f);

        Ludzie grandF2 = new Ludzie("GF2", true, 63, m);
        Ludzie grandM2 = new Ludzie("GM2", false, 62, m);


        System.out.println(grandF1);
        System.out.println(grandM1);
        System.out.println(grandF2);
        System.out.println(grandM2);
        System.out.println(f);
        System.out.println(m);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

    public static class Ludzie {
        String imie;
        boolean plec;
        int wiek;

        ArrayList<Ludzie> dzieci = new ArrayList<>();

        public Ludzie(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
        }

        public Ludzie(String imie, boolean plec, int wiek, Ludzie... dzieci) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;

            Collections.addAll(this.dzieci, dzieci);
        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            int licznikDzieci = this.dzieci.size();
            if (licznikDzieci > 0) {
                tekst += ", dzieci: " + this.dzieci.get(0).imie;

                for (int i = 1; i <licznikDzieci; i++) {
                    Ludzie dziecko = this.dzieci.get(i);
                    tekst += ", " + dziecko.imie;
                }
            }
            return tekst;
        }
    }

}
