package oop.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LamdaEx5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("dog", "cat", "elephant", "rabbit");
        Collections.sort(strings, (s1,s2) -> s1.compareTo(s2));

        Collections.sort(strings, String::compareTo);

        //2. 정수리스트 스트리밍하기
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int total1 = integers.stream().filter(x -> x%2 == 0).mapToInt(Integer::intValue)
                .sum();

        int total2 = integers.stream().filter(x -> x%2 == 1)
                .mapToInt(Integer::intValue)
                .sum();

        String[] str1 = {"aaa", "bbb", "ccc"};
        List<String> strlist = Arrays.asList(str1);
        Stream<String> stringStream = strlist.stream();
        Stream<String> str1Stream = Arrays.stream(str1);

        //스트림은 데이터소스로 부터 데이터를 읽기만 할뿐, 변경하지 않는다
        //한번 사용하면 닫혀서 다시 사용할 수 없다.
        //스트림 작업은 내부 반복으로 처리한다.
    }
}
