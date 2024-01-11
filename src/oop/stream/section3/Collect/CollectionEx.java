package oop.stream.section3.Collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionEx {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("구민석", 1, "M"));
        memberList.add(new Member("구민재", 2, "M"));
        memberList.add(new Member("구민순", 3, "F"));
        memberList.add(new Member("구민숙", 4, "F"));
        memberList.add(new Member("윤석열", 5, "M"));

        //남자 회원만 "M" 따로 menList에

        List<Member> menList = memberList.stream().filter(x -> x.getGender().equals("M")).collect(Collectors.toList());
        System.out.println(menList);

        List<String> nameList = new ArrayList<>();
        memberList.stream().forEach(x -> nameList.add(x.getName()));

        Map<Integer, String> map = memberList.stream().collect(Collectors.toMap(Member::getNo, Member::getName));

        System.out.println(map);

        Map<String, List<Member>> listMap = memberList.stream().collect(Collectors.groupingBy(Member::getGender));

        List<Member> maleMemberList = listMap.get("M");
        maleMemberList.stream().forEach(member -> System.out.print(member.getName() + " "));

        List<Member> femaleMemberList = listMap.get("F");
        System.out.println();
        femaleMemberList.stream().forEach(member -> System.out.print(member.getName() + " "));

    }
}
