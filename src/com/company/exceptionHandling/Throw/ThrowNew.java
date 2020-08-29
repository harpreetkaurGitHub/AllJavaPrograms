package com.company.exceptionHandling.Throw;

public class ThrowNew {

    public static void student(int marks,int id) {
       try{
           if(marks<35 && id!=0) {
               throw new ArithmeticException("Student is  Eligible for next class");
           }
           else {
               System.out.println("Student not is valid!");
           }
       }
       catch (ArithmeticException e) {
           e.printStackTrace();
           System.out.println("Exception catched");
       }
    }

    public static void main(String[] args) {

        student(55,0);
    }
}
