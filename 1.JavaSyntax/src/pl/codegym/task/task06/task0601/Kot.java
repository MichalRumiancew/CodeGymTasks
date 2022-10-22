package pl.codegym.task.task06.task0601;

/* 
Metoda finalize (obiektu) Kot
*/

public class Kot {
    public String name;
    public int age;

    public Kot() {
    }

    public Kot(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {

    }
}
