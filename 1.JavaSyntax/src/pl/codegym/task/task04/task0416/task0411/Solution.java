package pl.codegym.task.task04.task0416.task0411;

/* 
Pory Roku na Terze
*/

public class Solution {
    public static void main(String[] args) {
        sprawdzPoreRoku(12);
        sprawdzPoreRoku(4);
        sprawdzPoreRoku(7);
        sprawdzPoreRoku(10);
    }

    public static void sprawdzPoreRoku(int miesiac) {
        if (miesiac == 12 || miesiac == 1 || miesiac == 2) {
            System.out.println("zima");
        }
        else if (miesiac == 3 || miesiac == 4 || miesiac == 5){
            System.out.println("wiosna");
        }
        else if (miesiac == 6 || miesiac == 7 || miesiac == 8){
            System.out.println("lato");
        }
        else if (miesiac == 9 || miesiac == 10 || miesiac == 11){
            System.out.println("jesień");
        }
    }
}

//    public  static void sprawdzPoreRoku(int miesiac) {
//        switch (miesiac) {
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("zima");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("wiosna");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("lato");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("jesień");
//                break;
//            default:
//                break;
//        }