package com.company.Threadss.ThreadVariables;

import com.company.Threadss.ThreadColor;

public class ThreadVariables {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();
        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class Countdown {

    /*here variable i is global variable so ot stored in heap memory , so both thread have to read it from heap not from thread stack*/
    private int i;

    public  void doCountdown() {
        /*here variable i is local variable so it stored on each thread stack , that variable is avail on every thread stack , changing the variable value will not
        effect another thread value*/
       // int i;
        String color;


        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }

        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
        }
    }
}

class CountdownThread extends Thread {

    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}