package pl.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Spis ludności
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Kowwalski", "Jan");
        map.put("Johnson", "Daniel");
        map.put("Williams", "Jason");
        map.put("Jones", "Christopher");
        map.put("Brown", "Daniel");
        map.put("Davis", "Jason");
        map.put("Miller", "Christopher");
        map.put("Wilson", "Daniel");
        map.put("Anderson", "Jason");
        map.put("Jackson", "Christopher");
        return map;
    }

    public static int getLicznikTakichSamychImion(HashMap<String, String> map, String imie) {
        int count = 0;
        for (String nameTemp : map.values()) {
            if (nameTemp.equals(imie)) {
                count++;
            }
        }
        return count;
    }

    public static int getLicznikTakichSamychNazwisk(HashMap<String, String> map, String nazwisko) {
        int count = 0;
        for (String lastNameTmp : map.keySet()) {
            if (lastNameTmp.equals(nazwisko)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
