package oop.generic;

public class MyClass2 {


    static <T> void swap(T[] t, int n1, int n2)
    {
        T temp;
        temp = t[n1];
        t[n1] = t[n2];
        t[n2] = temp;
    }
}
