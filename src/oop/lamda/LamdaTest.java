package oop.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface Multifly
{
    abstract int multifly2(int n);
}
interface plusString
{
    abstract String plus(String x, String y);
}
public class LamdaTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "pear", "orange");

        // 1. 오름차순 정렬
        Collections.sort(list, String::compareTo);

        //2. 문자열 대문자 변환
        List<String> upperlist = list.stream().map(s -> s.toUpperCase()).toList();

        // 3. 문자열 비어있는지
        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));
        //4. 두 문자열 연결
        plusString plusString = (x,y) -> "%s%s".formatted(x, y);
        BiFunction<String, String, String> concatename = String::concat;
        System.out.println(concatename.apply("자바신세계", "개발자 과정"));
        //5. 숫자의 제곱 계산
        Multifly multifly = mul -> mul*mul;
        Function<Integer, Integer> square = (number) -> number*number;
        System.out.println(square.apply(3));
    }
}
