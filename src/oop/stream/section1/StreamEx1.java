package oop.stream.section1;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        Stream<Integer> stm1 = Arrays.stream(array).boxed();

        Stream<Integer> stm2 = stm1.filter(n -> n%2 == 1);

        int sum = stm2.mapToInt(Integer::intValue).sum();

        System.out.println("sum = " + sum);

    }
}
