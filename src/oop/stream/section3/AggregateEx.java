package oop.stream.section3;

import java.util.Arrays;

public class AggregateEx {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.stream(array).count());
        System.out.println(Arrays.stream(array).sum());
        System.out.println(Arrays.stream(array).average().orElse(0.0));
        System.out.println(Arrays.stream(array).max().orElse(0));
        System.out.println(Arrays.stream(array).min().orElse(0));
        System.out.println(Arrays.stream(array).findFirst().orElse(0));
    }
}
