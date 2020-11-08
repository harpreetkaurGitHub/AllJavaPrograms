package com.company.Oops.staticFile;

public class StaticBlocks {
    static private int b = 99;
    static private int num;

    static private void staticMethod() {
        System.out.println("Hi i am static method :D");
    }
    static  {
        System.out.println("Hi i am Static Block 1");
    }
    static {
        System.out.println("Hi i am static block 2");
        num = 78;
        b = 10;
    }
    static {
        System.out.println("Hi i am static block 3");
        num = 24;
    }

    public static void main(String[] args) {

        staticMethod();
        System.out.println("I am calling static variable" + " " + b);
        System.out.println("I am calling static block variable" +" " + num);
    }
}

