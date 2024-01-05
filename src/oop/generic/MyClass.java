package oop.generic;

import java.util.Arrays;

public class MyClass {

    public <T> void printArray(T[] t)
    {
        Arrays.stream(t).forEach(t1 -> System.out.println(Arrays.toString(t)));
    }
}
