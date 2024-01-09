package oop.lamda.quiz;

import java.util.function.BiFunction;

public class quiz2 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> plus = (a, b) -> a+b;
        System.out.println(plus.apply(1,2));
    }
}
