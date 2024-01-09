package oop.lamda.quiz;

import java.util.List;

public class quiz7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        double result = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("result = " + result);
    }
}
