package pl.codegym.task.task09.task0918;

/* 
Wszyscy są naszymi kumplami, nawet wyjątki
*/

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends Throwable {
    }

    static class MyException2 extends ClassNotFoundException {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends IllegalStateException {
    }
}
