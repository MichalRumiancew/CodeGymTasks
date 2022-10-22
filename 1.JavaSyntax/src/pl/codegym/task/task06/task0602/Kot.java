package pl.codegym.task.task06.task0602;

/* 
Koty zombie, psy zombie
*/

public class Kot {
    public static void main(String[] args) {

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Kot został zniszczony");

    }

}

class Pies {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Pies został zniszczony");
    }
}
