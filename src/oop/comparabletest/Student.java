package oop.comparabletest;

public class Student implements Comparable<Student>{
    String name; //이름
    int id; //학번
    double score; //학점
    public Student(String name, int id, double score){
        this.name = name;
        this.id = id;
        this.score = score;
    }
    public String toString(){ //출력용 toString오버라이드
        return "이름: "+name+", 학번: "+id+", 학점: "+score;
    }

    @Override
    public int compareTo(Student o) {
        return id - o.id;
    }
}