package pl.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Jaka dzisiaj jest data?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateIn = reader.readLine();

        SimpleDateFormat sdfIn = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        Date dateOut = sdfIn.parse(dateIn);

        SimpleDateFormat sdfOut = new SimpleDateFormat("d MMM yyyy", new Locale("pl"));

        System.out.println(sdfOut.format(dateOut).toUpperCase());
    }
}