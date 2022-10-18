package pl.codegym.task.task05.task0526;

/* 
Mężczyzna i kobieta
*/

public class Solution {
    public static void main(String[] args) {

        Mezczyzna mezczyzna1 = new Mezczyzna("aaa", 2, "BBB");
        Mezczyzna mezczyzna2 = new Mezczyzna("Adam", 22, "www");
        Kobieta kobieta1 = new Kobieta("Ala", 17, "zzz");
        Kobieta kobieta2 = new Kobieta("Marta", 33, "VVV");
        System.out.println(mezczyzna1);
        System.out.println(mezczyzna2);
        System.out.println(kobieta1);
        System.out.println(kobieta2);
    }

    public static class Mezczyzna {
        String imie;
        int wiek;
        String adres;

        public Mezczyzna(String imie, int wiek, String adres) {
            this.imie = imie;
            this.adres = adres;
            this.wiek = wiek;
        }

        public String toString() {
            return (imie + " " + wiek + " " + adres);
        }
    }

    public static class Kobieta {

        String imie;
        int wiek;
        String adres;

        public Kobieta(String imie, int wiek, String adres) {
            this.imie = imie;
            this.adres = adres;
            this.wiek = wiek;
        }

        public String toString() {
            return (imie + " " + wiek + " " + adres);
        }
    }
}

