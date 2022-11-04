package pl.codegym.task.task06.task0611;

/* 
Klasa StringHelper
*/

public class StringHelper {

    public static String multiply(String s) {
        return multiply(s, 5);
    }

    public static String multiply(String s, int licznik) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < licznik; i++) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}