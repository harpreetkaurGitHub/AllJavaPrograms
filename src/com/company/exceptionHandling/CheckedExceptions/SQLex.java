package com.company.exceptionHandling.CheckedExceptions;

public class SQLex {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c1 = Class.forName("java.lang.Runtime");
        System.out.println("class sucessfully loaded" +c1.toString());

    }
}
