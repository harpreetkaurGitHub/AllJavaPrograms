package com.company.Threadss;

public class RunnableInterface implements Runnable {
    @Override
    public void run() {
        for (int i=0 ; i<10 ; i++) {
            System.out.println(Thread.currentThread().getId() + " value " + i);
        }
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread obj  = new Thread(new RunnableInterface());
        Thread obj1  = new Thread(new RunnableInterface());
        obj.start();
        obj1.start();
    }
}
// todo 1. yield method
//  2. deamon threads
//  3. join method working
//  4. wait,notify,notifyall