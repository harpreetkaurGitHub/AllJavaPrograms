package com.company.exceptionHandling.Throw;

import com.company.exceptionHandling.UncheckedExceptions.ExceptionClass;

public class ThrowClass extends ExceptionClass {

    String str1;

    void MyException(String str2) {
        str1 = str2;
    }

    public String toString() {
        return ("MyException Occurred: " + str1);
    }

    public static void main(String args[]) {
        try {
            System.out.println("Starting of try block");

//            throw new ThrowClass("i am throw exception");
        } catch (Exception exp) {
            System.out.println("Catch Block");
            System.out.println(exp);
//        }
        }
    }
}


