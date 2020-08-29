package com.company.abstractClass;

import com.company.Interface.Home;

public abstract class Abstract{
    public abstract void bird();
    public  abstract  void legs();
    public  void accessB() {
        System.out.println(Home.b);
    }
    public void overide() {

    }

    public static void main(String[] args) {
        System.out.println(Home.a);
    }

}
