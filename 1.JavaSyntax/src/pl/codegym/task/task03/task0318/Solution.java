package pl.codegym.task.task03.task0318;

import java.io.*;

/*
Plan podboju świata
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String lat = reader.readLine();
        String imie = reader.readLine();

        System.out.println(imie + " przejmie władzę nad światem za " + lat + " lat. Mua ha ha!");
    }
}