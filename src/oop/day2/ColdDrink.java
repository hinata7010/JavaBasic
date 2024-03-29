package oop.day2;

public abstract class ColdDrink implements Item{
    @Override
    public Packing packing()
    {
        return new Bottle();
    }

    public abstract float price();
}
