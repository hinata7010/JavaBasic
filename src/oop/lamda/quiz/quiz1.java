package oop.lamda.quiz;

import java.util.ArrayList;
import java.util.List;

public class quiz1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        int total = list.stream().filter(a -> a%2 == 0).mapToInt(Integer::intValue).sum();
    }
}
