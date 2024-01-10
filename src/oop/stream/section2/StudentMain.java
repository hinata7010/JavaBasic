package oop.stream.section2;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("구민석", 99));
        list.add(new Student("팔민석", 88));
        list.add(new Student("칠민석", 77));
        list.add(new Student("육민석", 66));
        list.add(new Student("오민석", 55));
        list.add(new Student("사민석", 44));
        list.add(new Student("삼민석", 33));
        list.add(new Student("이민석", 22));

        double result = list.stream().mapToDouble(s -> s.getScore()).average().orElse(0.0);
        System.out.println("result = " + result);
    }
}
