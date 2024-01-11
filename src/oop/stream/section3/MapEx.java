package oop.stream.section3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapEx {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);

        intStream.asDoubleStream().forEach(System.out::println);

    }
}
