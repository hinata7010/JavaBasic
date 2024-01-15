package oop.thread.threadex;

public class ThreadEx1 {
    public static void main(String[] args) {
        //1. 상속으로 Thread 생성
        ThreadByInheritance thread1 = new ThreadByInheritance();

        //2. Runnable Interface 로 생성
        Runnable runnable = new ThreadByImplement();
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(new ThreadByImplement());

        thread1.start();
        thread2.start();
    }
}


class ThreadByInheritance extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 500; i++) {
            System.out.print(0);
        }
    }
}

class ThreadByImplement implements Runnable
{

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(1);
        }
    }
}