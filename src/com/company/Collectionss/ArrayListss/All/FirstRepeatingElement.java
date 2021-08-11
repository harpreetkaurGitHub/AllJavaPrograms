package com.company.Collectionss.ArrayListss.All;

import java.util.Scanner;

public class FirstRepeatingElement {

    public static int method(int[] array) {
        int repeated = 0;
        int count=0;
        int j=0;
       try {
           if (array.length > 0) {
               for (int i=0;i<array.length;i++) {
                   if (i == array.length-1 && j < array.length){
                       i = 0;
                       j++;
                   }
                   if (array[i] == array[j] && i!=j){
                       repeated = array[i];
                       count = count+1;
                       if (count == 1) {
                           break;
                       }
                   }
               }
           }
       }
       catch (Exception e) {
           System.out.println("Exception occurred");
           e.printStackTrace();
       }
       return repeated;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i=0;i<array.length;i++) {
            System.out.print("Enter elements of array:");
            array[i] = scanner.nextInt();
        }
        System.out.println(method(array));
        scanner.close();
    }
}

/**
 * todo
 * data structures
 * largest sequence
 * largest sum sub array
 * missing number
 * most frequent element
 * move zeroes to start and end
 * rotate array left and right
 *
 */