package oop.stream.section3;

import java.util.Arrays;

public class PeekForEachEx {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        Arrays.stream(intArray).filter(number -> number%2 == 0).peek(n -> System.out.println(n));
        int total = Arrays.stream(intArray).filter(number -> number%2 == 0).peek(n -> System.out.println(n)).sum();
        System.out.println("total = " + total);
    }
}
