package oop.day2.basic.classEx.sec05.exam01;

public class Calculator {
	//리턴값이 없는 메소드 선언
    boolean power = false;

    public Calculator()
    {

    }

    public Calculator(boolean power) {
        this.power = power;
        if(this.power)
        {
            powerOn();
        }
        else
        {
            powerOff();
        }
    }

    public void powerOn()
    {
        this.power = true;
        System.out.println("전원이 켜졌습니다.");
    }

	//리턴값이 없는 메소드 선언
    public void powerOff()
    {
        this.power = false;
        System.out.println("전원을 종료합니다.");
    }

    public int plus(int n1, int n2)
    {
        return n1+n2;
    }

	//호출 시 두 정수 값을 전달받고, plus method
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언

    public double divide(int n1, int n2)
    {
        if(n2 == 0)
        {
            System.out.println("ZERO DIVIDE ERROR");
            return 0;
        }
        else
        {
            return (double)n1/n2;
        }
    }
	//호출 시 두 정수 값을 전달받고, divide 메소드
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언

}