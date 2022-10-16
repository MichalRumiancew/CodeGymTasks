package pl.codegym.task.task05.task0517;

/* 
Tworzenie kotów
*/

public class Kot {
    public String imie;
    public int wiek;
    public int waga;
    public String kolor;
    public String adres;

    public Kot(String imie) {
        this.imie = imie;
        this.wiek = 1;
        this.waga = 2;
        this.kolor = "bialy";
    }

    public Kot(String imie, int waga, int wiek) {
        this.imie = imie;
        this.waga = waga;
        this.wiek = wiek;
        this.kolor = "czarny";
    }

    public Kot(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = 2;
        this.kolor = "bialy";
    }

    public Kot(int waga, String kolor) {
        this.waga = waga;
        this.kolor = kolor;
        this.wiek = 8;

    }

    public Kot(int waga, String kolor, String adres) {
        this.waga = waga;
        this.kolor = kolor;
        this.adres = adres;
        this.wiek = 4;

    }

    public static void main(String[] args) {

    }
}
