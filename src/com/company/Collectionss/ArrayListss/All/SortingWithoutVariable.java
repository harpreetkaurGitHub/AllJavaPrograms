package com.company.Collectionss.ArrayListss.All;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class SortingWithoutVariable {

    public static void method(int[] array){
        try {
            if (Objects.nonNull(array)){
                for (int i=0;i<array.length;i++) {
                    for (int j=i;j<array.length;j++) {
                        if (array[j] > array[i]){
                            array[i] = array[i] + array[j];
                            array[j] = array[i] - array[j];
                            array[i] = array[i] - array[j];
                        }
                    }
                }
                System.out.print("Sorted Array: "+Arrays.toString(array));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i=0;i<array.length;i++){
            System.out.println("Enter element: "+ i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Original Array: "+Arrays.toString(array));

        method(array);
    }
}
