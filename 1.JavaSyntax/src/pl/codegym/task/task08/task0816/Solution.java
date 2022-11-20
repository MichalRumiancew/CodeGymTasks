package pl.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* 
Miła Emma i letnie wakacje
*/

public class Solution {
    public static HashMap<String, Date> utworzMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.forLanguageTag("pl"));
        HashMap<String, Date> mapa = new HashMap<String, Date>();
        mapa.put("Stallone", df.parse("CZERWIEC 1 1980"));
        mapa.put("Stallone2", df.parse("CZERWIEC 1 2012"));
        mapa.put("Stallone3", df.parse("LIPIEC 1 2012"));
        mapa.put("Schwarzenegger", df.parse("SIERPIEŃ 1 2012"));
        mapa.put("Schwarzenegger2", df.parse("WRZESIEŃ 1 2012"));
        mapa.put("Schwarzenegger3", df.parse("MAJ 1 2012"));
        mapa.put("Willis", df.parse("CZERWIEC 1 2012"));
        mapa.put("Willis2", df.parse("CZERWIEC 1 2012"));
        mapa.put("Willis3", df.parse("CZERWIEC 1 2012"));
        mapa.put("Stallone4", df.parse("CZERWIEC 1 2012"));
        return mapa;

    }

    public static void usunUrodzonychLatem(HashMap<String, Date> mapa) {
        HashMap<String, Date> copy = new HashMap<>(mapa);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                mapa.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}
