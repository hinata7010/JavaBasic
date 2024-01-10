package oop.stream.section2.product;

import com.sun.jdi.DoubleValue;

import java.io.IOException;
import java.lang.module.ResolutionException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamEx {
    public static int total;
    public static void main(String[] args) throws Exception {
        String[] strings = {"초코파이", "몽셸통통", "에이스", "포카칩"};
        //strings 스트림 객체를 얻어, strings의 각 요소 값을 출력하세요

        Arrays.stream(strings).forEach(System.out::println);

        // 2. Integer 스트림 객체 얻기

        int[] scores = {90, 80, 70, 60, 50, 23, 21, 55};
        int sum = Arrays.stream(scores).sum();
        double avg = Arrays.stream(scores).average().orElse(0.0);
        long count = Arrays.stream(scores).count();

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
        System.out.println("count = " + count);

        //
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(number -> total += number);
        System.out.println("총합 : " + total);

        IntStream.range(1, 16).forEach(x -> System.out.print((x % 5 == 0) ? "*\n" : "*"));

        // java.nio.file.Files.lines() 텍스트 파일의 행 단위 스트링을 얻을 수 있다.
        Path path = Paths.get(ArrayStreamEx.class.getResource("productlist.txt").toURI());
        Stream<String> filestream = Files.lines(path, Charset.defaultCharset());
        filestream.forEach(System.out::println);
        filestream.close();



    }
}
