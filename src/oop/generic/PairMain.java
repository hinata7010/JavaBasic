package oop.generic;

public class PairMain {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "Koo");

        System.out.println(pair.getT());
        System.out.println(pair.getU());
    }
}
