package com.company.DataStructure.Array;

import java.util.Arrays;

public class MergeSortedArray {

    public static int[] method(int[] arr1,int[] arr2,int[] arr3){
        int i=0;int j=0;
        arr1 = new int[arr1.length+arr2.length];

        for (i=0;i<arr3.length-1;i++) {
            arr3[i]=arr1[i];
            arr3[i+2] = arr2[i];
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,7,9};
        int[] arr2 = {2,5,6,8,0};
        int[] arr3 = new int[arr1.length+arr2.length];

        System.out.println(method(arr1,arr2,arr3));
        System.out.println(Arrays.toString(arr3));
    }
}
