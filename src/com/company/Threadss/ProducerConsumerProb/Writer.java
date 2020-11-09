package com.company.Threadss.ProducerConsumerProb;

import java.util.Random;

public class Writer implements Runnable {

    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String[] messages = {
                "hello how are you",
                "i am writing message",
                "ok lets write another one",
                "and last one"
        };
        Random random = new Random();
        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message.write("Finished");
    }
}
