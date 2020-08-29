package com.company.Udemy.Arrays;
import java.util.Scanner;

public class ResizedArray {

    public static Scanner scanner = new Scanner(System.in);
    public static int[] baseData = new int[10];

    public static void getInput() {
        for (int i=0 ; i<baseData.length ; i++) {
           baseData[i] = scanner.nextInt();
        }

    }
    public static void printArray(int[] arr) {
        for (int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void resizeArray() {
        int[] newResizedArray = baseData;
        baseData = new int[12];
        for (int i=0 ; i<newResizedArray.length ; i++) {
            baseData[i] = newResizedArray[i];
        }
    }


    public static void main(String[] args) {
        System.out.println("ENTER 10 INTEGERS :: ");
        getInput();
        printArray(baseData);
        System.out.println();
        resizeArray();
        baseData[10] = 20;
        baseData[11] = 24;
        printArray(baseData);


    }
}
