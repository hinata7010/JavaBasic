

package oop.lamda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Stringlength
{
    int length1(String string);
}

@FunctionalInterface
interface Calculate {
    abstract int oddsum(int[] numbers);
}

interface Calculate2
{
    abstract int hap(int x, int y);
}

@FunctionalInterface
interface FindMax
{
    int getMax(List<Integer> numbers);
}


public class LamdaEx2{
    public static void main(String[] args) {
        int[] number1 = {1,2,3,4,5};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(123123123);
        Calculate2 addition = (a,b) -> a + b;
        Stringlength stringlength = (string) -> string.length();
        int result = addition.hap(5, 3);
        int result2 = stringlength.length1("몇자인지 세어보아요");
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);

        int sumOfEvenNumbers = Arrays.stream(number1).filter(number -> number%2 == 0)
                .sum();

        System.out.println("sumOfEvenNumbers = " + sumOfEvenNumbers);

        FindMax findMax = (numbers) -> {
            int maxNumber = Integer.MIN_VALUE;
            for(int number : numbers)
            {
                if(number > maxNumber)
                {
                    maxNumber = number;
                }
            }
            return maxNumber;
        };

        int result3 = findMax.getMax(list);
        System.out.println("result3 = " + result3);

    }
}
