package com.company.exceptionHandling.Throw;

import com.company.exceptionHandling.Throw.Throw1;

public class Throw2 {
    public void method() throws Exception {

        System.out.println("method calling");
        String string = "Lambda";
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
