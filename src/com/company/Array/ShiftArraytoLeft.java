package com.company.Array;

import java.util.Arrays;

public class ShiftArraytoLeft {

    public static void method(int[] array,int target){
        int zero =0;

        for (int i=target;i<array.length-1;i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = zero;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,2,8,7,20,4};
        method(array,6);
    }
}
