package oop.stream.section2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamEx1 {

    //List컬렉션에 내부 반복자를 이용해서 병렬처리를 하는 방법
    //ParallelStream() : 병렬처리스트림
    public static void main(String[] args) {
        List<String> names = Arrays.asList("구민석석", "양성준", "윤여빈", "김혜지", "김소진");
        Stream<String> parallelStream = names.parallelStream();

        parallelStream.forEach(name ->
        {
            System.out.println(name + " : " + Thread.currentThread().getName());
        });
    }
}
