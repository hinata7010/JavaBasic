package oop.lamda.quiz;

interface Calculator
{
    abstract int calculator(int a, int b);
}
public class quiz9 {
    public static void main(String[] args) {
        Calculator calculator = (a,b) -> a+b;
        int result = calculator.calculator(1,3);
        System.out.println("result = " + result);

    }
}
