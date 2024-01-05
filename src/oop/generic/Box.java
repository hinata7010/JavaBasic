package oop.generic;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{

    private List<T> box;

    public Box() {
        box = new ArrayList<>();
    }

    public void additem(T t)
    {
        box.add(t);
    }

    public T getInItem(T t)
    {
        if(box.isEmpty())
        {
            T temp = box.get(0);
        }
        return null;
    }

    public boolean isEmpty()
    {
        return box.isEmpty();
    }

}
