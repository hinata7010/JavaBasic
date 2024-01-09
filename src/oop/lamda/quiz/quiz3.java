package oop.lamda.quiz;

import java.util.function.Function;

public class quiz3 {
    public static void main(String[] args) {
        Function<String, Integer> stringlength = String::length;
        int result = stringlength.apply("몇자일까요?");
        System.out.println("result = " + result);
    }
}
