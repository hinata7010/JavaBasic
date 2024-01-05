package oop.comparabletest;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain{
    public static void main(String[] args) {
        Student student[] = new Student[5];
        CompareScore compareScore = new CompareScore();
        //순서대로 "이름", 학번, 학점
        student[0] = new Student("Dave", 20240001, 4.2);
        student[1] = new Student("Amie", 20160001, 4.5);
        student[2] = new Student("Emma", 20110001, 3.5);
        student[3] = new Student("Brad", 20130001, 2.8);
        student[4] = new Student("Cara", 20140001, 4.2);

        Arrays.sort(student);
        System.out.println("1번 기준 정렬");
        for (Student  st : student)
            System.out.println(st);

        Arrays.sort(student, compareScore);
        System.out.println("2번 기준 정렬");
        for (int i = 0; i < 2; i++) {
            System.out.println(student[i]);
        }
    }
}
