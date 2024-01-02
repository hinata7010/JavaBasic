package oop.quiz;

public class quiz8 {
    public static void main(String[] args) {
        Member user1 = new Member("홍길동", "hong");
    }

    static class Member
    {
        int age;
        String name, id, pw;

        public Member(String name, String id) {
            this.name = name;
            this.id = id;
        }
    }
}
