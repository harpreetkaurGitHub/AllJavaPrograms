package com.company.Array;

import java.util.Arrays;

public class ShiftArrayToRight {
    public static void method(int[] array,int target){
        int temp=array.length-1; int zero =0;

        for (int i=array.length-1;i>=0;i--) {
            if (array[i] != target) {
                array[temp] = array[i];
                temp--;
            }
        }
        array[0] = zero;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {2,8,7,20,4,7,6};
        method(array,20);
    }
}
