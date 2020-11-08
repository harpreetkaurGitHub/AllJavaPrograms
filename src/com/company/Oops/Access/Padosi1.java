package com.company.Oops.Access;

import com.company.Oops.Interface.Home;

public class Padosi1 implements Home {
    void display() {
        System.out.println("padosi 1");
    }

    @Override
    public void kitchen() {

    }

    @Override
    public void bedroom() {
        System.out.println("Padosi 1 Bedroom ::::");
    }

    @Override
    public void overide() {

    }
}

