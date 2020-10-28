package com.company.Threadss;

import java.util.LinkedList;

// bounded buffer problem
public class ProducerConsumer {
    LinkedList<Integer> linkedList = new LinkedList<>();
    int  capacity = 2;

    public void produced() throws InterruptedException{
       int value = 0;
       while (true) {
           synchronized (this) {
               while (linkedList.size() == capacity) {
                   wait();
               }
               System.out.println("producer produce " + value);
               linkedList.add(value++);
               notify();
               Thread.sleep(100);
           }
       }
    }
    public void consume() throws InterruptedException {
       synchronized (this) {
           while (linkedList.size() == 0) {
               wait();
           }
           int val = linkedList.removeFirst();
           System.out.println("consumer consume " + val);
           notify();
           Thread.sleep(100);
       }
    }

    public static void main(String[] args) throws InterruptedException {

        final ProducerConsumer obj = new ProducerConsumer();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.produced();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
