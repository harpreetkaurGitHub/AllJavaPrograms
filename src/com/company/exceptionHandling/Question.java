package com.company.exceptionHandling;

import com.company.exceptionHandling.CustomExceptions.FavoExcaption;
import com.company.exceptionHandling.Throw.Throw1;

public class Question {


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
            System.out.println("Hey Exception Catched");

            try {
                String abc = null;
                abc.length();
            }
            catch (NullPointerException ex) {
                ex.printStackTrace();
                System.out.println("Null pointerexception");
            }
            }
        }
}
