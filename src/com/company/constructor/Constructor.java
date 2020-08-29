package com.company.constructor;

public class Constructor {

    String a ;
    private int b;

    Constructor() {
        this.b = 200;
        this.a = "Hello i am instance variable";
        System.out.println("Hi i am default const");
    }

    public static void main(String[] args) {
        Constructor def = new Constructor();
        System.out.println(def.a);
        System.out.println(def.b);
    }
}
