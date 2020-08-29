package com.company.exceptionHandling.UncheckedExceptions;

public class ExceptionClass {
    public static void main(String[] args) {
        int num,num1,divide;

        try {
            num = 0;
            num1 = 1;
            divide=num1/num;
            System.out.println(divide);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is exception");
        }
//        catch (Exception e) {
//            System.out.println("I catch all exceptions");
//        }
        System.out.println("Try catch block is end");
    }
}
