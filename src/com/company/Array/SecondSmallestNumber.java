package com.company.Array;

import static java.lang.Integer.MIN_VALUE;

public class SecondSmallestNumber {

    public static void main(String[] args) {
        int[] array = {1, 5, 4, 7, 9, 757, 53656, 23234, 234, 7, 0};
        find(array);
    }

    public static void find(int[] array) {
        int smallest = array[0];
        int secondSmallest = MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                secondSmallest = smallest;
                smallest = array[i];

            }
        }
        System.out.println("smallest number is : " + smallest +"\nsecond smallest Number is : " + secondSmallest);
    }
}
