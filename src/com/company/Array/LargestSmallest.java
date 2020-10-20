package com.company.Array;

import java.util.Arrays;

public class LargestSmallest {
    public static void getLargestInteger(int[] array){
        int smallest = array[0];
        int largest = array[0];

        for (int i=0;i<array.length-1;i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int[] array = {1,3,6,4,8,5,0,2,7};
        getLargestInteger(array);

    }
}
