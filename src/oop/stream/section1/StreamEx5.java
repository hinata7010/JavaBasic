package oop.stream.section1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Pear", "Orange", "Banana", "Tomato");
        System.out.println("대문자");
        list.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + ", "));
        System.out.println("\n소문자");
        list.stream().map(s -> s.toLowerCase()).forEach(s -> System.out.print(s + ", "));
        System.out.println();

        int total = IntStream.of(1,3,4,5,7).sum();
        System.out.println("total = " + total);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,33,22,20,7,8);
        int total2 = IntStream.of(numbers.stream().mapToInt(Integer::intValue).toArray()).sum(); //
        System.out.println("total2 = " + total2);
        
        long count = IntStream.of(1,2,3,4,5,6,7).count();
        System.out.println("count = " + count);

        Double avg = IntStream.of(1,2,3,4,5,6,7).average().orElse(0.0);

        int min = IntStream.of(3,5,7,8,10,1).min().orElse(0);
        System.out.println("min = " + min);

        int max = IntStream.of(3,5,7,8,10,1).max().orElse(0);
        System.out.println("max = " + max);
    }
}
