package oop.day2.basic.classEx.sec04.exam04;

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car() {}
	
	Car(String model) {
		//this.model = model;
		this(model, "while", 200);
	}
	
	Car(String model, String color) {
		/*this.model = model;
		this.color = color;*/
		this(model,color,200);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}