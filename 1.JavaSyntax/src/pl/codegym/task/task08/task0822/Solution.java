package pl.codegym.task.task08.task0822;
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Najmniejsza z N liczb
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> listaLiczbCalkowitych = getListaLiczbCalkowitych();
        System.out.println(getMinimum(listaLiczbCalkowitych));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            Integer number = array.get(i);
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static List<Integer> getListaLiczbCalkowitych() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Integer> array = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }
        return array;
    }
}
