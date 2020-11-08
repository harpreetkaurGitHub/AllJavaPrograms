package com.company.Oops.Interface;

public class Harpreet implements Home {

    @Override
    public void kitchen() {
        System.out.println("Cooking PIZZAA");
    }
    @Override
    public  void bedroom() {
        System.out.println("");
    }
    @Override
    public  void overide() {

    }

    public static void main(String[] args) {
        Home.staticMethod();
    }
}
