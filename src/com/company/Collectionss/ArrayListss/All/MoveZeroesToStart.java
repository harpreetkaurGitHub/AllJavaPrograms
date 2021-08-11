package com.company.Collectionss.ArrayListss.All;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesToStart {

    public static void method(int[] array){
        int j=0;
        int k=0;
        int length = array.length-1;

        for (int i=0;i<= array.length-1;i++) {
            if (array[i] == 0) {
                array[j] = array[i];
                j++;
            }
            else {
                array[length] = array[i];
                length--;
            }
        }
        System.out.println(Arrays.toString(array));
//        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        System.out.println("Enter array elements:");
        int[] array = new int[size];
        for (int i=0;i<array.length;i++) {
            array[i]  = scanner.nextInt();
        }
        method(array);
//        System.out.println(method(array));
        scanner.close();
    }
}
