package oop.stream.section3.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptinalEx {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
        System.out.println("avg = " + avg);

        if(avg.isPresent())
        {
            System.out.println("평균 = " + avg);
        }
        else
        {
            System.out.println("평균 = " + 0.0);
        }

        double doubleavg = list.stream()
                .mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("doubleavg = " + doubleavg);

        list.stream().mapToInt(Integer::intValue).average().ifPresent(average -> System.out.println("방법3" + average));
    }
}
