package oop.lamda.quiz;

import java.util.List;

public class quiz10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        int result = list.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).reduce((a,b) -> a+b).orElse(0);
        System.out.println("result = " + result);
    }
}
