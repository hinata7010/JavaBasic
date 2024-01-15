package oop.thread.threadex.suspendresumestop;
//Single Thread
import javax.swing.*;

public class ThreadDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            Thread t1 = new Thread(new ThreadEx1());

            try
            {
                t1.start();
                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
        }

        Thread t2 = new Thread(new ThreadEx1());
        t2.setName("Thread2");
        t2.start();

    }

    static class ThreadEx1 implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println("[" + Thread.currentThread().getName() + ", 종료]");
        }
    }


}
