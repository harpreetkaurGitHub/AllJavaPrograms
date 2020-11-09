package com.company.Threadss.ProducerConsumerProb;

public class Message {

    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
//            System.out.println("message stack is empty");
        }
        empty = true;
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {
//            System.out.println("Message stack reading");
        }
        this.message = message;
        empty = false;
    }
}
