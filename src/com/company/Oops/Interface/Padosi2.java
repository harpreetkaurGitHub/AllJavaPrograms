package com.company.Oops.Interface;

import com.company.Oops.Access.Padosi1;

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
        System.out.println("bedRoom");
    }
    @Override
    public void overide() {

    }

    public  static void getInstance(Class className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Home home = (Home) Class.forName(className.getName()).newInstance();


        home.bedroom();
    }






    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Padosi2 obj = new Padosi2();
        Home abc = new Padosi2();


        getInstance(Padosi1.class);


        //new Padosi2().kitchen();
       // obj.kitchen();
        //abc.kitchen();

        System.out.println();


    }
}
