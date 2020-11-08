package com.company.DataStructure.Array;

import java.util.Arrays;

public class RotateLeft{

    public static void getRotateArr(int[] array,int target){
       int start = 0;
       int end = array.length-target;
       int loop = target-1;
       int[] arr = new int[array.length];

       for (int i=0;i<array.length;i++) {
           if (i <= loop){
               arr[end] = array[i];
               end++;
           }
           if (i > loop) {
               arr[start] = array[i];
               start++;
           }
       }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        getRotateArr(array,4);
    }
}
