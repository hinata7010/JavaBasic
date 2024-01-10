package oop.stream.section1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx4 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("홍길동 제주도 도망", "풍자 먹찌빠", "강호동 아는형님", "유재석 유퀴즈 온더 블록", "서장훈 미운오리새끼", "신동엽 토요일이 즐겁다");

        System.out.println("사전순 정렬");
        stringList.stream().sorted((a,b) -> a.compareTo(b)).forEach(System.out::print);

        System.out.println("글자순 정렬");

        stringList.stream().sorted((a,b) -> a.length() - b.length()).forEach(System.out::print);

    }
}
