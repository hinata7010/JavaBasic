package oop.lamda.quiz;

import java.util.List;

public class quiz6 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        int result = list.stream().reduce(1, (a,b) -> a*b);
        System.out.println("result = " + result);
    }
}
