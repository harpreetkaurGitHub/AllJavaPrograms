package com.company.Collectionss.ArrayListss.All;

import java.util.Scanner;

public class LargestSequence {

    public static void method(int[] array){
        int[] sequence = new int[array.length];
        int diffrence = 1;
        int k=0;
        int count=-1;
        for (int i=0;i<array.length;i++) {
            if ((array[i + 1] - array[i]) == diffrence && (i+1!=array.length)) {
                sequence[k] = array[i];
                k++;
                count+=2;
            }
            else {
                if (i == count){
                    sequence[i] = array[i];
                    break;
                }
            }
        }
        for (int i=0;i<sequence.length;i++) {
            System.out.print(sequence[i] +" ");
        }
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
        scanner.close();
    }
}
