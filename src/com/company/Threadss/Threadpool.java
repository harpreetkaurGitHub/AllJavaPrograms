package com.company.Threadss;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool implements Runnable {
    private String name;
    static final int threadsNumber = 3;

    public Threadpool(String s) {
        name = s;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <=5 ; i++) {
                System.out.println(i);
            }
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        Runnable runnable1 = new Threadpool("task1");
        Runnable runnable2 = new Threadpool("task2");
        Runnable runnable3 = new Threadpool("task3");
        Runnable runnable4 = new Threadpool("task4");
        Runnable runnable5 = new Threadpool("task5");

        ExecutorService pool = Executors.newFixedThreadPool(threadsNumber);

        pool.execute(runnable1);
        pool.execute(runnable2);
        pool.execute(runnable3);
        pool.execute(runnable4);
        pool.execute(runnable5);

        pool.shutdown();
    }
}
