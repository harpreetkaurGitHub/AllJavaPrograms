package com.company.Threadss;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue implements Runnable {
    private List queue = new LinkedList();
    private int limit = 0 ;

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    public synchronized void enqueue(Object item) throws InterruptedException {
        while (this.queue.size() == this.limit) {
            wait();
        }
        this.queue.add(item);
        if (queue.size() == 1) {
            notifyAll();
        }
    }
    public synchronized Object dequeue() throws InterruptedException {
        while (this.queue.size() == 0) {
            wait();
        }
        if (this.queue.size() == this.limit) {
            notifyAll();
        }
        return this.queue.remove(0);
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new BlockingQueue(10);
        Thread thread = new Thread(blockingQueue);

        blockingQueue.enqueue(20);
        blockingQueue.dequeue();
    }

    @Override
    public void run() {
        new BlockingQueue(10);
    }
}
