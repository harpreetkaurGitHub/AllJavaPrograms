package com.company.Threadss;

public class Dt implements Runnable {
    public void run() {
        while(true){
            processSomething();
        }
    }

    private void processSomething() {
        try {
            System.out.println("Processing daemon thread");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
            Thread dt = new Thread(new DeamonThread(), "dt");
            dt.setDaemon(true);
            dt.start();
            //continue program
            Thread.sleep(30000);
            System.out.println("Finishing program");
        }

    }