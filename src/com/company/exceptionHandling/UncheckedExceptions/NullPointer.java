package com.company.exceptionHandling.UncheckedExceptions;

public class NullPointer {

    String object = null;

//    String object ="Harpreet";


    public static void main(String[] args) {

        try {
            NullPointer obj = new NullPointer();

            System.out.println(obj.object.length());
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("There is no characters in the string");
        }
    }
}
