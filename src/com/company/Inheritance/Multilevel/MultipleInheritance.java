package com.company.Inheritance.Multilevel;

import com.company.Inheritance.Interface2;
import com.company.Inheritance.Interfce1;

public class MultipleInheritance implements Interfce1, Interface2 {

    public void method() {
        Interfce1.super.method();
        Interface2.super.method();
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.method();
    }
}
