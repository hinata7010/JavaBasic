package oop.day3;

public class CalMain {
    public static void main(String[] args) {
        Inheritance01 obj = new Inheritance01();

        System.out.println("두수의 합은 " + obj.addition(20, 10));
        System.out.println("두수의 뺄셈 " + obj.subtraction(20, 10));
        System.out.println("두수의 곱은 " + obj.multiplication(20, 10));
    }
}
