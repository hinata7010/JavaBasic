package oop.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaEx4 {
    public static void main(String[] args) {

        // 컬렉션 연산을 위한 람다 제공 map
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squaredNumber = numbers.stream().map(n-> n*n).collect(Collectors.toList());
        System.out.println(squaredNumber);

        // filter
        // 조건에 따라 스트림에서 요소를 선택하는데 사용 ( 조건을 정의하는 람다 표현식을 인수로 받는다)
        numbers.stream().filter(n -> n%2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        numbers.stream().filter(n -> n%2 == 1).forEach(n -> System.out.print(n + " "));
        System.out.println();
        // 3. 집계함수 : REDUCE() : 스트림의 요소를 단일 값으로 집계하는 사용
        int total = numbers.stream().reduce(0, (x, y) -> x+y);
        System.out.println("total = " + total);

        //4. forEach() : 스트림의 요소를 반복하고 각 요소에 대해서 작업을 수행하는데 사용
        numbers.stream().forEach(number -> System.out.println(number));

        //응용 문제 스트림 api를 사용하여 numbers의 평균을 구하는 람다식을 작성하세요
        double avg = numbers.stream().mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("avg = " + avg);
    }
}
