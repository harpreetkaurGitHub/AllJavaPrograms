package com.company.Threadss;

public class Deadlock extends Thread {
    public static void main(String[] args) {
        final String string1 = "string lock 1";
        final String string2 = "string lock 2";

        Thread thread1 = new Thread(){
            public void run() {
                synchronized (string1) {
                    System.out.println("thread 1 locked string1");
                    try {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e) {}
                    synchronized (string2) {
                        System.out.println("thread 1 locked string2");
                    }
                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                synchronized (string2) {
                    System.out.println("thread 2 locked string2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {}
                    synchronized (string1) {
                        System.out.println("thread 2 locked string1");
                    }
                }
            }
        };
        thread1.start();
        System.out.println("thread1 " + thread1.getState() + thread1.getPriority() + thread1.isAlive());

        thread2.start();
        System.out.println("thread2 " + thread2.getState() + thread2.getPriority() + thread2.isAlive());
    }
}
