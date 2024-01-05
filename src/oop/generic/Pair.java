package oop.generic;

public class Pair <T, U>{
    private T t;
    private U u;

    public Pair(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }

    public void swap(T t, U u)
    {
        this.t = (T) u;
        this.u = (U) t;
    }
}
