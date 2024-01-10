package oop.stream.section1;

import java.util.Arrays;
import java.util.List;

public class StreamEx6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("구민석석", "양성준", "윤여빈", "김혜지", "김소진");
        String name1 = names.stream()
                .reduce("이순신", (s1, s2) -> s1.length() >= s2.length() ? s1: s2);
        System.out.println(name1);

        List<Integer> numbers = Arrays.asList(10, 5, 3, 5, 11,7 ,12, 1);
        int result = numbers.stream().reduce(0, (x, y) -> x+y);
        int result2 = numbers.stream().reduce(1, (x, y) -> x*y);
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }
}
