package pl.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Bank-świnka na bazie konsoli
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            String command = reader.readLine();
            if (command.equals("sumuj")) {
                System.out.println(sum);
                return;
            }
            int a = Integer.parseInt(command);
            sum += a;
        }
    }
}
