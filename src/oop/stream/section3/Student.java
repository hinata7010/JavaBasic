package oop.stream.section3;

public class Student {

    int number=1;
    private int stuno;
    private String name;
    private Integer korscore;

    private Integer mathscore;

    private Integer engscore;

    public Integer getKorscore() {
        return korscore;
    }

    public int getStuno() {
        return stuno;
    }

    public Integer getMathscore() {
        return mathscore;
    }

    public Integer getEngscore() {
        return engscore;
    }

    @Override
    public String toString() {
        return String.format("%3s %3s %4s %3s %3s %3s", this.stuno, this.name,this.korscore,this.engscore,this.mathscore);
    }

    public Student(String name, Integer korscore, Integer mathscore, Integer engscore) {
        this.stuno = number++;
        this.name = name;
        this.korscore = korscore;
        this.mathscore = mathscore;
        this.engscore = engscore;
    }

    public String getName() {
        return name;
    }
}
