package com.company.DataStructure.Array;

import static java.lang.Integer.MIN_VALUE;

public class SecondSmallestNumber {

    public static void main(String[] args) {
        int[] array = {1,3,6,4,8,5,0,2,7};
        find(array);
    }

    public static void find(int[] array) {
        int smallest = array[0];
        int largest = array[0];
        int secondLargest =0;
        int secondSmallest = MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                secondSmallest = smallest;
                smallest = array[i];
            }
        }
        System.out.println("smallest number is : " + smallest +"\nsecond smallest Number is : " + secondSmallest);
        System.out.println("largest number is : " + smallest +"\nsecond largest Number is : " + secondLargest);
    }
}
