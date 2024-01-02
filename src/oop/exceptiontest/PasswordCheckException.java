package oop.exceptiontest;

public class PasswordCheckException extends Exception{
    public PasswordCheckException(String message)
    {
        super(message);
    }
}

//- 예외 상황 메세지를 생성자에서 입력받는다.
//- Exception 클래스에서 메시지 생성자, 멤버 변수, 메소드를 제공받아서 예외 메세지를 설정함
