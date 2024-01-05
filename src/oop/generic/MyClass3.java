package oop.generic;

public class MyClass3 <T>{

    public int countOccurrences(T[] array, T t)
    {
        int count = 0;
        for (T t1 : array)
        {
            if(t1.equals(t))
            {
                count++;
            }
        }

        return count;
    }
}
