package oop.thread.threadex.interupt;
//Single Thread
import javax.swing.*;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadEx1());
        t1.start();
        String yes = JOptionPane.showInputDialog("게임을 다시 진행할까요? [Y/N]");
        t1.interrupt();
        System.out.println("isInterrupted : " + t1.isInterrupted());

    }

    static class ThreadEx1 implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            int i = 10;
            Boolean flag = Thread.currentThread().isInterrupted();
            System.out.println(flag);
            while(i != 0 && !Thread.currentThread().isInterrupted())
            {
                System.out.println(i--);
                for(long x = 0; x< 2500000000L ; x++)
                {

                }
                System.out.println("[" + Thread.currentThread().getName() + ", 카운트 다운 종료]");
            }
        }
    }


}
