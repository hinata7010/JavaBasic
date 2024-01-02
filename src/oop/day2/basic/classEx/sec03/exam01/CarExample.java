package oop.day2.basic.classEx.sec03.exam01;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car c1 = new Car();
		//Car 객체의 필드값 읽기
		c1.carinfo();
		c1.setModel("QM5");
		c1.setSpeed(100);
		c1.startengin();
		c1.carinfo();
	}
}