package pl.codegym.task.task08.task0802;

/* 
HashMap z 10 par
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("arbuz", "melon");
        map.put("banan", "owoc");
        map.put("wiśnia", "owoc");
        map.put("gruszka", "owoc");
        map.put("kantalupa", "melon");
        map.put("jeżyna", "owoc");
        map.put("żeńszeń", "korzeń");
        map.put("truskawka", "owoc");
        map.put("irys", "kwiat");
        map.put("ziemniak", "bulwa");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}