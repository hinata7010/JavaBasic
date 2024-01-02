package oop.exceptiontest;

import java.util.Scanner;

public class LoginExample {

    static Scanner input = new Scanner(System.in);
    String password;

    private String userID;

    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if(userID == null){
            throw new IDFormatException("아이디는 null 일 수 없습니다.");
        } else if(userID.length() < 8 || userID.length() >20){
            throw new IDFormatException("아이디는 8자 이상 , 20자 이하만 가능합니다.");
        }
        this.userID = userID;
    }

    public void setPassword(String password) throws PasswordCheckException {
        if(password == null)
        {
            throw new PasswordCheckException("비밀번호는 null 일 수 없습니다.");
        }
        else if(password.length() < 5)
        {
            throw new PasswordCheckException("비밀번호는 5자 이상으로 사용해주세요");
        }
        else if(!password.matches("[a-zA-Z0-9]+"))
        {
            throw new PasswordCheckException("비밀번호는 문자열로만 가능합니다 ^^");
        }

        this.password = password;
    }

    public void checkdup(LoginExample test[], String userID, String password, int length) throws NotExitIDWrongPasswordException
    {
        for (int i = 0; i < length; i++) {
            if(test[i].getPassword().equals(password) || test[i].getUserID().equals(userID))
            {
                throw new NotExitIDWrongPasswordException("중복된 비밀번호 혹은 ID입니다.");
            }
        }
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        LoginExample test[] = new LoginExample[5];
        String userID;
        String password;
        for (int i = 0; i < 5; i++) {
            test[i] = new LoginExample();
            try
            {
                System.out.print("ID를 입력하세요. ");
                userID = input.next();
                System.out.print("비밀번호를 입력하세요. ");
                password = input.next();
                test[i].checkdup(test, userID, password, i);
                test[i].setUserID(userID);
                test[i].setPassword(password);
                System.out.println(test[i].getUserID() +"회원가입 완료");
            }
            catch (IDFormatException | PasswordCheckException e)
            {
                System.out.println(e.getMessage());
            }
            catch (NotExitIDWrongPasswordException e)
            {
                System.out.println(e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println("예외 발생 프로그램 다시 시작");
            }
        }
    }
}
