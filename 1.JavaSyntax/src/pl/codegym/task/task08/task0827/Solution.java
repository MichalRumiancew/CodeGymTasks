package pl.codegym.task.task08.task0827;

import java.util.Date;

/* 
Praca z datami
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDataNieparzysta("MAY 1 2013"));
    }

    public static boolean isDataNieparzysta(String date) {

            Date dd = new Date(date);
            Date dd2 = new Date(date);
            dd2.setDate(1);
            dd2.setMonth(0);
            long time = dd.getTime() - dd2.getTime();
            long days = time / 24 / 60 / 60000 + 1;
            return days % 2 == 1;
        }
    }