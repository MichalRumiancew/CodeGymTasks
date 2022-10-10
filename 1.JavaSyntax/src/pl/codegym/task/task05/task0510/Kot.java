package pl.codegym.task.task05.task0510;

/* 
Inicjalizowanie kotów
*/

public class Kot {
    public String imie;
    public int wiek;
    public int waga;
    public String kolor;
    public String adres;

    public void inicjalizuj(String imie) {
        this.imie = imie;
        this.wiek = 1;
        this.waga = 1;
        this.kolor = "Black";
    }

    public void inicjalizuj(String imie, int waga, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
        this.kolor = "Black";
    }

    public void inicjalizuj(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = 1;
        this.kolor = "Black";
    }

    public void inicjalizuj(int waga, String kolor) {
        this.waga = waga;
        this.kolor = kolor;
        this.wiek = 1;
    }

    public void inicjalizuj(int waga, String kolor, String adres) {
        this.waga = waga;
        this.adres = adres;
        this.kolor = kolor;
        this.wiek = 1;
    }

    public static void main(String[] args) {

    }
}
