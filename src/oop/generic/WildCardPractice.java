package oop.generic;

import java.util.ArrayList;

public class WildCardPractice {
    public void printList(ArrayList<?> list)
    {
        for (Object o : list)
        {
            System.out.println(o);
        }
    }
}
