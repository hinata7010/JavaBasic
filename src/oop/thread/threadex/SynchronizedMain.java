package oop.thread.threadex;

public class SynchronizedMain {
    public static void main(String[] args) {
        Caculator caculator = new Caculator();

        User1Thread user1 = new User1Thread();
        user1.setCaculator(caculator);
        user1.start();
        User2Thread user2 = new User2Thread();
        user2.setCaculator(caculator);
        user2.start();

        System.out.println(caculator.getMemory());
    }
}
