package oop.stream.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        List<Integer> list = new ArrayList<>();
        Arrays.stream(array).filter(n -> n%2 == 1).forEach(x -> list.add(x));

        list.stream().sorted().forEach(System.out::println);

    }
}
