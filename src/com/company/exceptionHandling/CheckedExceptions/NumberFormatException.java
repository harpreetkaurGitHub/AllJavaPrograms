package com.company.exceptionHandling.CheckedExceptions;

public class NumberFormatException {

    public static String s = "abc";

    public static void main(String[] args) {

        try {
            int a = Integer.parseInt(s);
        }
        catch (java.lang.NumberFormatException e) {
            e.printStackTrace();
            System.out.println("catched invalid argument corect it");
        }
    }
}
