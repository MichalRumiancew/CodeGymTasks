package pl.codegym.task.task06.task0609;

/* 
Odległość między dwoma punktami
*/

public class Util {

    public static double getOdleglosc(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {

    }
}
