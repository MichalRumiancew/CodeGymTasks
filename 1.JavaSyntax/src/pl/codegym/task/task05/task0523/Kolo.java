package pl.codegym.task.task05.task0523;

/* 
Konstruktor
*/

public class Kolo {

    public Kolor kolor;

    public Kolo() {
        kolor = new Kolor();
    }

    public static void main(String[] args) {
        Kolo kolo = new Kolo();
        kolo.kolor.setOpis("Czerwony");
        System.out.println(kolo.kolor.getOpis());
    }

    public class Kolor {

        String opis;

        public String getOpis() {
            return opis;
        }

        public void setOpis(String opis) {

            this.opis = opis;
        }
    }
}
