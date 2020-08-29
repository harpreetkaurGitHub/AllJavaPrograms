package com.company.Udemy.Arrays;
import java.util.Scanner;

public class Arrayss1 {
    public static Scanner scan = new Scanner(System.in);

    public static int[] method(int num) {
        System.out.println(" Enter " + num + " Integer values ");
        int[] orignalArray = new int[num];
        for (int i=0 ; i<orignalArray.length ; i++) {
            orignalArray[i] = scan.nextInt();
        }
        return orignalArray;
    }

    public static double getAvg(int[] array) {
        int sum = 0;

        for (int i=0 ; i<array.length ; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
    public static void main(String[] args) {

        int[] newArray = method(6);

        for (int i=0 ; i<newArray.length ; i++) {
            System.out.println(" Index " + i + " Element value " + newArray[i]);
        }
        System.out.println("Avg od array is " + getAvg(newArray));
    }

}
