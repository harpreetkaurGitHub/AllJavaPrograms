package com.company.Threadss;

public class ReadWriteLock {
    int reader = 0;
    int writer = 0;
    int writerRequest = 0;

    public synchronized void readLock()  throws InterruptedException {
        if (writer>0 || writerRequest>0) {
            wait();
        }
        reader++;
    }
    public synchronized void unlockRead() {
        reader--;
        notifyAll();
    }
    public synchronized void lockWriter() throws InterruptedException {
        writerRequest++;
        while (reader>0 || writer>0) {
            wait();
        }
        writerRequest--;
        writer++;
    }
    public synchronized void unlockWriter() {
        writer--;
        notifyAll();
    }
    public static void main(String[] args) {

    }
}
