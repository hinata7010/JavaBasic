package oop.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Product
{
    int calculate(List<Integer> list);
}
public class LamdaEx3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);

        Product product = products -> products.stream().reduce(1, (a,b) -> a*b);
        List<Integer> list = List.of(2,3,4);
        System.out.println(product.calculate(list));

        // 4. 이름 리스트를 알파벳 순서로 정렬하세요

        List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");
        /*Collections.sort(names, new Comparator<String>()
        {
            public int compare(String s1, String s2)
            {
                return s1.compareTo(s2);
            }
        });

        Collections.sort(names, (a,b)->a.compareTo(b));*/

        List<String> upperCaseNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseNames);
    }
}
