package oop.quiz;

import java.util.Scanner;

public class 문자열1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            String n = string.substring(i, i + 1);
            if ('a' <= n.charAt(0) && 'z' >= n.charAt(0)) {
                result.append(n.toUpperCase());
            } else if ('A' <= n.charAt(0) && 'Z' >= n.charAt(0)) {
                result.append(n.toLowerCase());
            } else {
                result.append(n);
            }
        }

        System.out.println(result.toString());
    }
}
