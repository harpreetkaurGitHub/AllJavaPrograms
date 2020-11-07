package com.company.Queue;

public class CreateQueue {
    int maxSize;
    int front;
    int rear;
    int nTimes;
    long[] queue;

    public CreateQueue(int size){
        this.maxSize = size;
        this.front=0;
        this.rear=-1;
        this.nTimes=0;
        this.queue = new long[size];
    }

    public void insert(int i){

        if (rear == maxSize-1) {   // this cause circular queue
            rear = -1;
        }
        rear++;
        queue[rear] = i;
        nTimes++;
    }

    public void viewElements(){
        System.out.print("[");
        for (int i=0;i<queue.length;i++) {
            System.out.print(queue[i] +" ");
        }
        System.out.println("]");
    }

    public long remove(){
        long temp = queue[front];
        front++;
        if (front == maxSize){
            front=0;
        }
        nTimes--;
        return temp;
    }

    public long peekFront(){
        return queue[front];
    }
    public static void main(String[] args) {
        CreateQueue createQueue = new CreateQueue(4);
        createQueue.insert(45);
        createQueue.insert(55);
        createQueue.insert(35);
        createQueue.insert(85);
        createQueue.insert(95);
        createQueue.viewElements();
        System.out.println(":: Removed front item :: ");
        System.out.println(createQueue.remove());
        System.out.println(":: Front item :: ");
        System.out.println(createQueue.peekFront());
    }
}
