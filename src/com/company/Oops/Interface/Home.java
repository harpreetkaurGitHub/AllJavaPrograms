package com.company.Oops.Interface;

public interface Home {

    void kitchen();
    void bedroom();
    void overide();
    static void staticMethod(){
        System.out.println("i am static method from interface");
    }
    int a = 24;
    int b = 20;

    public static void main(String[] args) {
        staticMethod();
    }
}

