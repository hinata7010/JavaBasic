package oop.day2.basic.classEx.sec03.exam01;

public class Car {
	//필드 선언 모델과 엔진을 시작 끄는 기능이 있음
    private String model;
    private float speed;
    private boolean engin = false;

    public void startengin()
    {
        this.engin = true;
    }

    public void stopengin()
    {
        this.engin = false;
    }

    public void carinfo()
    {
        System.out.println("모델명은 : " + this.model + " 이고 속도는 시속" + speed + "km이고 현재 엔진상태는 " + engin + "입니다.");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

}