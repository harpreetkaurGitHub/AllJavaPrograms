package com.company.exceptionHandling.CheckedExceptions;

import com.company.exceptionHandling.CustomExceptions.NewException;

public class Checked3 {

    public void method1() {

        int a = 10;
        int b = 0;
        int c = a/b;
        System.out.println(c);

    }
    public void method2() throws NullPointerException {

        String abc = null;
        System.out.println(abc.length());


    }
    public void method3() throws ArrayIndexOutOfBoundsException {
        int[] array = {34,56,67,78,56,};

        System.out.println(array[7]);
    }
    public void method4() throws RuntimeException, NewException {
        throw new NewException("throw custom exception");
    }

    public static void main(String[] args) throws NewException {
        Checked3 obj = new Checked3();

        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();

    }
}
