package pl.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Usuń i wstaw
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lista.add(bis.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String line = lista.remove(4); // 5-1
            lista.add(0,line);

        }
        for (String line : lista){
            System.out.println(line);
        }
    }
}
