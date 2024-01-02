package oop.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void additem(Item item)
    {
        items.add(item);
    }

    public float getCost()
    {
        float cost = 0.0f;
        for(Item item : items)
        {
            cost += item.price();
        }
        return cost;
    }

    public void showitems()
    {
        for(Item item : items)
        {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.print(", Price : " + item.price());
        }
    }
}
