package com.company.exceptionHandling.Throw;

import com.company.exceptionHandling.CustomExceptions.FavoExcaption;

public class Throw1 {


    public void method() throws Exception {

        method1();
    }
    public void method1() throws Exception {
        method2();
    }
    public void method2() throws Exception {

        throw new FavoExcaption("I can't Handle this Exception");
    }

    public static void main(String[] args) throws Exception {

        try {
            Throw1 obj = new Throw1();

            obj.method();
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new Exception("hey we have throw exception variable e",e);

//            System.out.println("Hey Exception Catched");
        }

        try {
            System.out.println("try to catch exception variable e");
        }
        catch (Exception e) {
            System.out.println("Now we have catched E variable");
        }
    }
}
