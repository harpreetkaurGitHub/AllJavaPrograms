package com.company.Interface;

public class Padosi2 implements Home {

    @Override
    public void kitchen() {
        System.out.println("Waching Food");
    }
    public void display() {
        System.out.println("Display");
    }
    @Override
    public void bedroom() {
        System.out.println();
    }
    @Override
    public void overide() {

    }

    public static void main(String[] args) {
        Padosi2 obj = new Padosi2();
        Home abc = new Padosi2();

        //new Padosi2().kitchen();
        obj.kitchen();
        abc.kitchen();

        System.out.println();


    }
}
