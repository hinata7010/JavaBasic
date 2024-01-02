package oop.exceptiontest;

public class NotExitIDWrongPasswordException extends Exception{
    public NotExitIDWrongPasswordException(String message)
    {
        super(message);
    }
}
