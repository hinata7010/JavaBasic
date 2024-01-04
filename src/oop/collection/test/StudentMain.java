package oop.collection.test;

public class StudentMain {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();

        studentDao.studentExamInsert(1, "구민석", 100 , 100, 100);
        studentDao.studentExamInsert(2, "팔민석", 88, 88, 88);
        studentDao.studentExamInsert(1, "구민석", 100 , 100, 100);
        studentDao.studentPrintAll();
        studentDao.studentPickPrint(2);
        studentDao.studentRecordPrint(2);
        studentDao.studentUpdate(2, 77, 77, 77);
        studentDao.studentPickPrint(2);
        studentDao.studentRecordPrint(2);
    }
}
