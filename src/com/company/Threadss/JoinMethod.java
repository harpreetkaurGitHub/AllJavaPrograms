package com.company.Threadss;

public class JoinMethod {

    private static int var = 0;
    public static void main(String[] args) {
        Thread obj = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().getId());
                }
            }
        });
        Thread obj1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    var++;
                }
            }
        });

        obj.start();
        obj1.start();

        obj.setName("manjuBai");
        System.out.println(obj.getName());

        try {
            obj.join();
            obj1.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("var value  :: "+var);
    }

}
