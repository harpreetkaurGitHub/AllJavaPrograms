package com.company.constructor;

public class NoargumentContructor {

    int s;

    public NoargumentContructor() {
        this.s=10;

        System.out.println(" Iam no argument contructor");
    }

    public static void main(String[] args) {

//      new NoargumentContructor();
        NoargumentContructor obj = new NoargumentContructor();

        System.out.println(obj.s);

    }
}
