package com.company.exceptionHandling.Throws;

public class ThrowsClass {

    public static void Throws() throws ArithmeticException {

        int abc = 0;
        int number = 24;
        int result = number/abc;
    }
    public static void main(String[] args) {

       try {
           System.out.println("Go to the throws() method");
           Throws();
       }
       catch (ArithmeticException e) {
           System.out.println("Hello ArithmeticException catched ");
           e.printStackTrace();

       }
       catch (NullPointerException e) {
           e.printStackTrace();
       }
       catch (Exception e) {
           e.printStackTrace();
       }

    }
}
