package oop.stream.section3;

import static java.lang.Math.round;
public class TotalExam {
    Student student;
    int sum;
    double avg;

    public TotalExam(Student student) {
        this.student = student;
        this.sum = student.getEngscore() + student.getKorscore() + student.getMathscore();
        this.avg = (double) sum /3;
    }

    @Override
    public String toString() {
        return String.format("%-4s \t %-6s\t %-3s \t %-3s \t %-3s \t %-3s \t %-3s", student.getStuno(), student.getName(),student.getKorscore(), student.getEngscore(), student.getMathscore(), this.sum, round(this.avg));
    }
}
