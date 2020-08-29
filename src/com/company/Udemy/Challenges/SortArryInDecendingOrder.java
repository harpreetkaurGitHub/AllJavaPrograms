package com.company.Udemy.Challenges;
import java.util.Arrays;
import java.util.Scanner;

public class SortArryInDecendingOrder {

    public static Scanner scanner = new Scanner(System.in);

    public static int[] getInteger(int num) {
        System.out.println("Enter " + num + " of values");

        int[] printArray = new int[num];
        for (int i=0 ; i<printArray.length ; i++) {
            printArray[i] = scanner.nextInt();
        }
        return printArray;
    }
    public static int[] sortedArray(int[] array) {
        boolean flag = true;
        while (flag) {
            flag=false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int var = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = var;
                    flag=true;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] newArray = getInteger(6);

        for (int i=0 ; i<newArray.length ; i++) {
            System.out.println(newArray[i]);
        }
        System.out.println(Arrays.toString(sortedArray(newArray)));
    }
}