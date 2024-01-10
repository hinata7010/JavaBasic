package oop.lamda.quiz;

import java.util.Arrays;

public class quiz16 {

    private static int[] scores = {10, 50, 3};
    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for(int score : scores)
        {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(
                (a, b) -> Math.max(a,b)
        );
        System.out.println("최대값 " + max);
    }
}
