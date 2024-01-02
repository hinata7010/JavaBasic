package oop.day2.basic.classEx.sec06;
//가변길이 매개변수
//메소드를 호출할때, 파라미터의 타입과 순서가 중요함 원래는
//근데 가변길이 매개변수를 가지고 있다면? 매개변수의 개수와 상관없이 매개값을 제공해야한다.

public class Computer
{
    boolean power = false;
    int sum(int ... values)
    {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }
    
    boolean isPower()
    {
        if(power)
        {
            System.out.println("전원이 켜져있습니다");
            return true;
        }
        System.out.println("전원이 꺼져있습니다");
        return false;
    }
}
