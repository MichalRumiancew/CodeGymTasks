package pl.codegym.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Wyświetl dzisiejszą datę
*/

public class Solution {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
