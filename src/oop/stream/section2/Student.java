package oop.stream.section2;

import java.util.function.BiFunction;

public class Student {

    private String name;
    private Integer score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}
