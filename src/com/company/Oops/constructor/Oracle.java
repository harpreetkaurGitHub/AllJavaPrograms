package com.company.Oops.constructor;

public class Oracle {

    public static void main(String[] args) {
        int x=10;
        int y= new Oracle().change(x);
        System.out.println(x+y);

    }
    int change(int x) {
        x=12;
        return x;
    }

}
