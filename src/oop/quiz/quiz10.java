package oop.quiz;

public class quiz10 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }

        System.out.println(max);
    }
}
