package oop.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int sumOfEvenNumbers = numbers.stream()
                .filter(number->number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sumOfEvenNumbers = " + sumOfEvenNumbers);
    }
}
