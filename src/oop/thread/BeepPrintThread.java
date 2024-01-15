package oop.thread;

public class BeepPrintThread {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    setName("subThread");
                    System.out.println(getName() + "실행 중");
                }
            };

            thread.start();
        }


        Thread mainThread = Thread.currentThread();
        mainThread.setName("I am MainThread");
        System.out.println(mainThread.getName() + "실행 중");

    }
}
