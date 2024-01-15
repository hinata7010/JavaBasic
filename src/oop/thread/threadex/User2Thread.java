package oop.thread.threadex;

public class User2Thread extends Thread{
    private Caculator caculator;

    public User2Thread()
    {
        setName("User1Thread");
    }

    public void setCaculator(Caculator caculator)
    {
        this.caculator = caculator;
    }

    @Override
    public void run() {
        caculator.setMemory2(50);
    }
}
