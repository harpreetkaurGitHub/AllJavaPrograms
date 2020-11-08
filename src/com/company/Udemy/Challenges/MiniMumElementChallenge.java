package com.company.Udemy.Challenges;

import java.util.Scanner;

public class MiniMumElementChallenge {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] readInteger(int count) {
        System.out.println(count + " Integers user needs to enter");

        int[] Array = new int[count];
        for (int i=0 ; i<Array.length ; i++) {
            Array[i] = scanner.nextInt();
        }
        return Array;
    }
    public static int finMin(int[] array){
        int var;

        for (int i=0 ; i<array.length-1 ; i++) {
            if (array[i] > array[i+1]) {
                var = array[i];
                array[i] = array[i+1];
                array[i+1] = var;
//            array[0] = array[array.length-1];
            }
        }
        return array[0];
    }


    public static void main(String[] args) {

       int[] returnArray = readInteger(5);

       for (int i=0 ; i<returnArray.length ; i++) {
           System.out.println("Entered number " + returnArray[i]);
       }
        System.out.println(finMin(returnArray));

    }
}
