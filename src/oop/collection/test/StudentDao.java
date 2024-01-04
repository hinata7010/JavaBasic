package oop.collection.test;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    List<Student> stuList = new ArrayList<>();


    public void studentExamInsert(int stuNo, String name, int korean, int english, int math)
    {
        for (Student student : stuList) {
            if (student.stuNo == stuNo) {
                System.out.println("중복된 학번입니다.");
                return;
            }
        }



        stuList.add(new Student(stuNo, name));
        studentUpdate(stuNo, korean, english, math);
    }

    public void studentRecordPrint(int stuNo)
    {
        int sum = 0;
        double avg;
        for (Student student : stuList) {
            if (student.stuNo == stuNo) {
                for (int i = 0; i < student.grade.length; i++) {
                    sum += student.grade[i];
                }
            }
        }


        avg = (double) sum / 3;

        System.out.println(stuNo + "학생의 성적은 평균은 " + avg + "이고 총점은 " + sum + "입니다.");
    }

    public void studentUpdate(int stuNo, int korean, int english, int math)
    {
        for (Student student : stuList) {
            if (student.stuNo == stuNo) {
                student.grade[0] = korean;
                student.grade[1] = english;
                student.grade[2] = math;
            }
        }
    }

    public void studentPrintAll()
    {
        System.out.println("전체 학생 리스트");
        for (Student student : stuList)
        {
            System.out.println("학번 : " + student.stuNo + " 이름 : " + student.name +
                    "\n성적 국어 : " + student.grade[0] + " 영어 : " + student.grade[1]
                    + " 수학 : " + student.grade[2]);
        }
    }

    public void studentPickPrint(int stuNo)
    {
        System.out.println(stuNo + "학번 학생 정보입니다.");
        for (Student student : stuList) {
            if (student.stuNo == stuNo) {
                System.out.println("학번 : " + student.stuNo + " 이름 : " + student.name +
                        "\n성적 국어 : " + student.grade[0] + " 영어 : " + student.grade[1]
                        + " 수학 : " + student.grade[2]);
                break;
            }
        }
    }
}
