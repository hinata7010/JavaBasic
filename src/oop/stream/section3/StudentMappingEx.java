package oop.stream.section3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentMappingEx {
    public static void main(String[] args) {
        List<Student> stulist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 국 수 영 순서대로 입력하세요");
        for (int i = 0; i < 5; i++) {
            stulist.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        /*구민석 99 99 99
        팔민석 88 88 88
        칠민석 77 77 77
        육민석 66 66 66
        오민석 55 55 55  출력문 복사해서 쓰세요 */

        List<String> nameList = new ArrayList<>();
        stulist.stream().forEach(x -> nameList.add(x.getName()));
        System.out.println("학생 리스트 출력");
        nameList.stream().forEach(t -> System.out.print(t + " "));
        System.out.println("\n오름차순 정렬된 학생 이름 리스트");
        nameList.stream().sorted().forEach(t -> System.out.print(t + " "));
        System.out.println("\n내림차순 정렬된 학생 이름 리스트");
        nameList.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
        List<Integer> koreScoreList = new ArrayList<>();
        stulist.stream().forEach(x -> koreScoreList.add(x.getKorscore()));
        System.out.println("\n학생 국어 점수 리스트 출력");
        koreScoreList.stream().forEach(t -> System.out.print(t + " "));
        System.out.println("\n오름차순 정렬된 학생 국어 점수 리스트");
        koreScoreList.stream().sorted().forEach(t -> System.out.print(t + " "));
        System.out.println("\n내림차순 정렬된 학생 국어 점수 리스트");
        koreScoreList.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
        System.out.println("\n국어 점수 총합");
        System.out.println(koreScoreList.stream().mapToInt(Integer::intValue).sum());
        System.out.println("국어 점수 평균");
        System.out.println(koreScoreList.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0));
        List<Integer> engScoreList = new ArrayList<>();
        stulist.stream().forEach(x -> engScoreList.add(x.getEngscore()));
        System.out.println("학생 영어 점수 리스트 출력");
        engScoreList.stream().forEach(t -> System.out.print(t + " "));
        System.out.println("\n오름차순 정렬된 학생 영어 점수 리스트");
        engScoreList.stream().sorted().forEach(t -> System.out.print(t + " "));
        System.out.println("\n내림차순 정렬된 학생 영어 점수 리스트");
        engScoreList.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
        System.out.println("\n영어 점수 총합");
        System.out.println(engScoreList.stream().mapToInt(Integer::intValue).sum());
        System.out.println("영어 점수 평균");
        System.out.println(engScoreList.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0));
        List<Integer> mathScoreList = new ArrayList<>();
        System.out.println("학생 수학 점수 리스트 출력");
        stulist.stream().forEach(x -> mathScoreList.add(x.getMathscore()));
        mathScoreList.stream().forEach(t -> System.out.print(t + " "));
        System.out.println("\n오름차순 정렬된 학생 수학 점수 리스트");
        mathScoreList.stream().sorted().forEach(t -> System.out.print(t + " "));
        System.out.println("\n내림차순 정렬된 학생 수학 점수 리스트");
        mathScoreList.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
        System.out.println("\n수학 점수 총합");
        System.out.println(mathScoreList.stream().mapToInt(Integer::intValue).sum());
        System.out.println("수학 점수 평균");
        System.out.println(mathScoreList.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0));
        System.out.println("최종 성적표");
        System.out.printf("%-4s \t %-6s\t %-3s \t %-3s \t %-3s \t %-3s \t %-3s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
        List<TotalExam> totalExamList = new ArrayList<>();
        for (Student student : stulist)
            totalExamList.add(new TotalExam(student));

        totalExamList.stream().sorted((Comparator.comparingDouble(o -> o.avg))).forEach(System.out::println);




    }


}


//Student 클래스 타입의 stulist 리스트 컬렉션을
//Scanner 클래스로 학생의 이름과 성적을 입력받아