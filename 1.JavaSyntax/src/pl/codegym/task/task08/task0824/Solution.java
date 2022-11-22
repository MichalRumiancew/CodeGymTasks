package pl.codegym.task.task08.task0824;
//
/* 
Załóż rodzinę
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
    }

    public static class Ludzie {
        //tutaj wpisz swój kod

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
