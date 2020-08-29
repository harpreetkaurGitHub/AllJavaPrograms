package com.company.Threadss;

public class NotifyAndWait extends Thread {
    int total;
    public void run() {
        synchronized (this) {
            for (int i=0 ; i<5 ; i++) {
                total += 1;
            }
            notify();
        }
    }
    public static void main(String[] args) {
        NotifyAndWait obj = new NotifyAndWait();
        obj.start();

        synchronized (obj) {
            try {
                System.out.println("wait obj is completing");
                obj.wait();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("obj is total  " + obj.total + Thread.currentThread().getId());
        }
    }
}
