package oop.thread.threadex;

public class ThreadDemonEx {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println("currentThread = " + t1);
        Thread t2 = new Thread(new ThreadEx11());
        System.out.println(t2);
    }
}

class ThreadEx11 implements Runnable
{
    @Override
    public void run() {

    }
}


//
