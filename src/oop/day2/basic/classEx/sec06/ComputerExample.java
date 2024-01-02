package oop.day2.basic.classEx.sec06;

import java.util.Arrays;

public class ComputerExample {
	public static void main(String[] args) {
		Computer c1 = new Computer();

		int result1 = c1.sum(1, 2, 3, 5, 6, 7,8);
		int result2 = c1.sum(1,2,3,4,5,6,7,8,9,10);
		int[] values = {123, 120, 123, 120};
		int result3 = c1.sum(values);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}