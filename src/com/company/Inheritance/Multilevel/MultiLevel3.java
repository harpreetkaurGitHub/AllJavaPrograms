package com.company.Inheritance.Multilevel;

public class MultiLevel3 extends MultiLevel2{
    public void MultilevelMethod3() {
        System.out.println("i am from multi level 3");
    }

    public static void main(String[] args) {
        MultiLevel3 obj = new MultiLevel3();
        System.out.println("This is multi level inheritance");
        obj.MultilevelMethod3();
        obj.multiLevel2Method();
        obj.multilevelMethod();
    }
}
