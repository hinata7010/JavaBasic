package oop.lamda.quiz;

interface MathOperation
{
    abstract int plus(int a, int b);
}
public class quiz8 {
    public static void main(String[] args) {
        MathOperation mathOperation = (a,b) -> a+b;
        int result = mathOperation.plus(1,3);
        System.out.println("result = " + result);
    }
}
