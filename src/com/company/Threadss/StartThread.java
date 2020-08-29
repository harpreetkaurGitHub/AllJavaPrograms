package com.company.Threadss;

public class StartThread extends Thread {

    public void run() {
            try {
                synchronized (this) {


                    for (int i = 0; i < 5; i++) {
                        int c;
                        System.out.println(Thread.currentThread().getName() + " Thread " + i);
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        StartThread obj = new StartThread();
        obj.setName("Harpreet");
        obj.start();
        StartThread obj1 = new StartThread();
        obj1.start();
        obj1.setName("Tannu");
        obj.getState();
    }
}
