package pl.codegym.task.task05.task0520;

/* 
Utwórz klasę Prostokat
*/

public class Prostokat {
    int gora;
    int lewy;
    int szerokosc;
    int wysokosc;

    public Prostokat(int gora, int lewy, int szerokosc, int wysokosc) {
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public Prostokat(int gora, int lewy) {
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = 0;
        this.wysokosc = 0;
    }

    public Prostokat(int gora, int lewy, int szerokosc) {
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = szerokosc;
        this.wysokosc = szerokosc;
    }

    public Prostokat(Prostokat prostokat) {
        this.gora = prostokat.gora;
        this.lewy = prostokat.lewy;
        this.szerokosc = prostokat.szerokosc;
        this.wysokosc = prostokat.wysokosc;
    }

    public static void main(String[] args) {

    }
}
