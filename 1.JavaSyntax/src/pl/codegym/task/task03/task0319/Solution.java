package pl.codegym.task.task03.task0319;

/* 
Prognozy
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imie = reader.readLine();
        String liczba1 = reader.readLine();
        String liczba2 = reader.readLine();

        System.out.println(imie + " dostanie " + liczba1 + " za " + liczba2 +  " lat.");
    }
}
