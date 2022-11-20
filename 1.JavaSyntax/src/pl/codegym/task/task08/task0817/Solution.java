package pl.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Powtórzenia nie są potrzebne
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("Stallone", "Sylvester");
        mapa.put("Stallone2", "Bruce");
        mapa.put("Stallone3", "Arnold");
        mapa.put("Schwarzenegger", "Sylvester");
        mapa.put("Schwarzenegger2", "Bruce");
        mapa.put("Schwarzenegger3", "Arnold");
        mapa.put("Willis", "Sylvester");
        mapa.put("Willis2", "Bruce");
        mapa.put("Willis3", "Arnold");
        mapa.put("Stallone4", "Sylvester4");
        return mapa;
    }

    public static void usunPowtorzoneImiona(Map<String, String> mapa) {
        HashMap<String, String> kopia = new HashMap<>(mapa);

        for (String copyName : kopia.values()) {
            int count = 0;
            for (String name : mapa.values()) {
                if (name.equals(copyName)) {
                    count++;
                }
            }
            if (count > 1) {
                usunElementZMapPoWartosci(mapa, copyName);
            }
        }
    }

    public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> para : kopia.entrySet()) {
            if (para.getValue().equals(wartosc)) {
                mapa.remove(para.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
