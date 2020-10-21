package com.company.Array;

import java.util.Arrays;

public class RotateLeft{

    public static int[] getRotateArr(int[] array,int times,int target){

        if (times!=target){
            times++;
            int lastElement = array[array.length-1];
            for (int i=array.length-1;i>0;i--) {
                array[i] = array[i-1];
            }
            array[0] = lastElement;
            getRotateArr(array,times,target);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] arr = getRotateArr(array,0,3);
        System.out.println(Arrays.toString(arr));
    }
}
