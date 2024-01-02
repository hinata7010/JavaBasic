package oop.exception;

import java.util.Scanner;

public class FinallyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        returnintFinally(n1, n2);
    }

    public static void returnintFinally(int number1, int number2)
    {
        double result=0;
        try
        {
            result = number1 /number2;
            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
    }
}
