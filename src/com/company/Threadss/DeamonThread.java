package com.company.Threadss;

public class DeamonThread extends Thread {

    public void run() {
        if (currentThread().isDaemon()) {
            System.out.println("deamon threa is working");
        }
        else {
            System.out.println("user thread work");
        }
        System.out.println("Deamon :: " + currentThread().isDaemon());
        System.out.println("Name ::" + currentThread().getName());
    }

    public static void main(String[] args) {
        DeamonThread obj = new DeamonThread(); // it is creating thread
        DeamonThread obj1 = new DeamonThread(); // it is creating thread
        DeamonThread obj2 = new DeamonThread(); // it is creating thread
        obj.setDaemon(true);   // now it is deamon thread
        obj.start();
        obj1.start();
        obj2.start();
    }
}
