package com.company.Threadss;

public class Lock {

    // this is simple lock
    private int count=0;
    public int inc() {
        synchronized (this) {
            return count++;
        }
    }
    // simple lock 2
    private Lock2 lock2 = new Lock2();
    private int count2 = 0;
    public int inc2() throws InterruptedException {
        lock.lock();
        int newCount2 = ++ count2;
        lock.unlock();
        return newCount2;
    }
    // reentrant lock
    public synchronized void method() {
        method2();
    }
    public synchronized void method2(){}

    // Reentrant2
    private Lock2 lock  = new Lock2();
    public void outer() throws InterruptedException {
        lock.lock();
        lock.inner();
        lock.unlock();
    }
    public synchronized void inner() throws InterruptedException {
        lock.lock();
        lock.unlock();
    }
    public static void main(String[] args) {
    }
}