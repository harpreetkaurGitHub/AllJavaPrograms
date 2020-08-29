package com.company.constructor.Parameterised;

public class Parameterised2 {

    int r ;

    public Parameterised2(int s) {

        this.r=s;
    }

    public String dis() {

        return String.valueOf(r);

    }

    public static void main(String[] args) {
        Parameterised2 obj = new Parameterised2(20);
        System.out.println(obj.dis());

    }
}
