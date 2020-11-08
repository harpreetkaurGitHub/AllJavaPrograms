package com.company.Oops.constructor;

public class Test {
    Test(double[] integer){
        System.out.println("Integer");
    }
    Test(Object obj){
        System.out.println("object");
    }
    public static void main(String[] args) {
        Test istance = new Test(null);
    }
}
