package oop.stream.section3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringEx1 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("구민석", "팔민석", "칠민석", "육민석", "오민석", "구민석", "육민석", "정올", "정상인이없다", "정안되면", "정우정", "구민정", "팔민정");

        nameList.stream().distinct().forEach(t -> System.out.println(t));

        nameList.stream().filter(x -> x.startsWith("정")).forEach(System.out::println);

        List<String> lastnameList = nameList.stream().filter(x -> x.endsWith("정")).toList();

        lastnameList.stream().forEach(x -> System.out.println(x));
    }
}
