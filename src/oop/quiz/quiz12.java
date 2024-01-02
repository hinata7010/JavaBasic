package oop.quiz;

import java.util.Scanner;

public class quiz12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
        System.out.println("---------------------");
        Student[] students = new Student[0];
        while(true)
        {
            System.out.print("선택> ");
            int casenum = Integer.parseInt(sc.nextLine());
            switch (casenum)
            {
                case 1:
                    System.out.print("학생수 :");
                    students = new Student[Integer.parseInt(sc.nextLine())];
                    break;
                case 2:
                    for (int i = 0; i < students.length; i++) {
                        System.out.print("students[" + i + "]>");
                        students[i] = new Student(Integer.toString(i));
                        students[i].score = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 3:
                    for (int i = 0; i < students.length; i++) {
                        System.out.println("students[" + i + "]>" + students[i].getScore());
                    }
                    break;
                case 4:
                    int sum = 0, max = Integer.MIN_VALUE;
                    double avg;
                    for (int i = 0; i < students.length; i++) {
                        sum += students[i].score;
                        if(students[i].score > max)
                        {
                            max = students[i].score;
                        }
                    }
                    avg = (double) sum / students.length;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg);
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    System.exit(1);
                    break;
            }
        }
    }

    public static class Student
    {
        String name;
        int score;

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public Student(String name) {
            this.name = name;
        }
    }
}
