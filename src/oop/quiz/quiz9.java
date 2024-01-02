package oop.quiz;

public class quiz9 {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();

        boolean result = memberService.login("hong", "12345");
        if(result)
        {
            System.out.println("로그인 되었습니다.");
            memberService.logout(("hong"));
        }
        else
        {
            System.out.println("id또는 password가 올바르지 않습니다.");
        }
    }

    static class MemberService
    {
        String id, password;

        public boolean login(String id, String pw)
        {
            return id.equals("hong") && pw.equals("12345");
        }

        public void logout(String id)
        {
            System.out.println(id + "님이 로그아웃 되었습니다.");
        }
    }
}
