package oop.day2.basic.classEx.sec05.exam01;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator c1 = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		//리턴값이 없는 powerOn() 메소드 호출
		c1.powerOn();

		int result1 = c1.plus(5, 6);
		//plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
		//덧셈 결과를 리턴 받아 result1 변수에 대입

		System.out.print("나눗셈 할 두 정수를 입력하세요~ ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double result2 = c1.divide(x, y);
		//divide() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고,
		//나눗셈 결과를 리턴 받아 result2 변수에 대입
		System.out.println(result1 + " " + String.format("%.2f", result2));
		c1.powerOff();
		//리턴값이 없는 powerOff() 메소드 호출

	}
}