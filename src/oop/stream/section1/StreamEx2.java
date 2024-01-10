package oop.stream.section1;

import java.util.Arrays;

public class StreamEx2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int sum = Arrays.stream(array).filter(n -> n%2 == 1).sum();

    }
}
