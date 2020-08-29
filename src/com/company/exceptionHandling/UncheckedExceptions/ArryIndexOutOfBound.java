package com.company.exceptionHandling.UncheckedExceptions;


public class ArryIndexOutOfBound {

    public static void main(String[] args) {

        int array[] = {10,34,54,67,53,65};

        try {
            for (int i=array.length-1;i>0;i--) {
                System.out.println("Index " + array[i] + " " +i);
            }
//            System.out.println(array[6]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Array exception catched");
        }


    }
}
