package com.company.Array;

import java.util.Arrays;

public class ShiftArraytoLeft {

    public static void method(int[] array,int target){
        int temp=0; int zero =0;

        for (int i=0;i<array.length-1;i++) {
            if (array[i] != target) {
                array[temp] = array[i];
                temp++;
            }
            array[array.length-1] = zero;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,2,8,7,20,4,7,6,4,0,66,54,27,-9,1,-2,4};
        method(array,20);
    }
}
