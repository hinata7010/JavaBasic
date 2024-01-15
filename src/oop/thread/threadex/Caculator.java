package oop.thread.threadex;

public class Caculator {
    private int memory;

    public int getMemory() {
        return this.memory;
    }

    public void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " : " + this.memory);
        }
    }

    public void setMemory2(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " : " + this.memory);
        }

    }
}
