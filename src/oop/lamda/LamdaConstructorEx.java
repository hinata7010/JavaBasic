package oop.lamda;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdaConstructorEx {
    public static void main(String[] args) {
        //1. 인수가 없는 생성자 참조 (Supplier 함수형 인터페이스 인수가 없는 객체의 공급자를 의미)
        // 참조된 생성자를 사용하여 새 객체를 생성하는 방법 제공
        //Supplier<ClassName> constructorRef = ClassName::new;

        //2. 인수가 있는 생성자 참조(인수를 받는 생성자를 나타낸다.)
        //Function<Integer, ClassName> constructorRef = ClassName::new;

        //3. 배열 생성자에 대한 참조
        //Function<Integer, ClassName[]> constructorRef = ClassName[]::new;

        //4. 제너릭 클래스의 생성자 참조
        //Supplier<GenericClass><Integer>> constructorRef = GenericClass<Integer>::new

        List<Integer> numbers = Stream.of(1,2,3,4,5).collect(Collectors.toCollection(ArrayList::new));
        int[] number = {1,2,3,4,5};

        BiFunction<String, Integer, Person> personFunction = Person::new;
        Person john = personFunction.apply("John", 20);

        Supplier<String> newString = String::new;
        String emptyString = newString.get();
        System.out.println(emptyString);

        //2. 인수가 없는 ArrayList 생성자를 사용하여 새 ArrayList 객체를 생성하는 람다식 작성
        Supplier<ArrayList<Integer>> newArray = ArrayList::new;
        ArrayList<Integer> emptyList = newArray.get();
        System.out.println(emptyList);



        //3. 인수가 없는 Random 생성자를 사용하여 새 Random 객체를 생성하는 람다식 작성
        Supplier<Random> newRandom = Random::new;
        Random emptyRandom = newRandom.get();
        System.out.println(emptyRandom.nextInt(100));

    }
}
