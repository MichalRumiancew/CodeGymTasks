package pl.codegym.task.task07.task0724;

/* 
Spis członków rodziny
*/

public class Solution {
    public static void main(String[] args) {
        Ludzie grandF1 = new Ludzie("aaa", true, 61);
        Ludzie grandM1 = new Ludzie("bbb", true, 66);

        Ludzie grandF2 = new Ludzie("ccc", true, 61);
        Ludzie grandM2 = new Ludzie("bbddd", true, 66);

        Ludzie f = new Ludzie("Adam", true, 29, grandF1, grandM1);
        Ludzie m = new Ludzie("Adam", true, 29, grandF2, grandM2);

        Ludzie c1 = new Ludzie("Adam", true, 29, f, m);
        Ludzie c2 = new Ludzie("Adam", true, 29, f, m);
        Ludzie c3 = new Ludzie("Adam", true, 29, f, m);

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
        Ludzie ojciec;
        Ludzie matka;

        public Ludzie(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
        }

        public Ludzie(String imie, boolean plec, int wiek, Ludzie ojciec, Ludzie matka) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            this.ojciec = ojciec;
            this.matka = matka;
        }


        // tutaj wpisz swój kod

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.ojciec != null) {
                tekst += ", ojciec: " + this.ojciec.imie;
            }

            if (this.matka != null) {
                tekst += ", matka: " + this.matka.imie;
            }

            return tekst;
        }
    }
}