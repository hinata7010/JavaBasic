package oop.exception;

import java.util.Scanner;

public class Arrayoutex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        try
        {
            for (int i = 0; i < 6; i++) {
                numbers[i] = sc.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
