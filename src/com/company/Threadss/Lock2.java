package com.company.Threadss;

public class Lock2 {
    private boolean islocked = false;

    public synchronized void lock() throws InterruptedException {
        while (islocked) {
            wait();
        }
        islocked = true;
    }
    public synchronized void unlock() {
        islocked = false;
        notify();
    }

    public void inner() {
    }
}
