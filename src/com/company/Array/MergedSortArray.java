package com.company.Array;

import java.util.Arrays;

public class MergedSortArray {


    public static void main(String[] args) {
            int[] arr1 = {};
            int[] arr2 = {4,6,30};
            int[] mergedSortedArray = mergedSortArray(arr1,arr2);

        System.out.println(Arrays.toString(mergedSortedArray));

        System.out.println(findMedianOfArray(mergedSortedArray));
    }


    public static int[] mergedSortArray(int[] array1, int[] array2) {

        int[] mergedSortArray = new int[array1.length + array2.length ];
        int array1Index = 0;
        int array2Index = 0;


       for(int i =0;i<mergedSortArray.length;i++) {

            if (array1Index!=array1.length&&(array2Index == array2.length ||array1[array1Index] < array2[array2Index])) {
                mergedSortArray[i] = array1[array1Index];
                array1Index++;
            }
            else {
                mergedSortArray[i] = array2[array2Index];
                array2Index++;

            }
        }

        return mergedSortArray;
    }


    public static double  findMedianOfArray(int[] sortedArray){

        int arrayLength = sortedArray.length;
        if(arrayLength%2!=0){
            return (double)sortedArray[arrayLength/2];

        }
        return (double)(sortedArray[(arrayLength-1)/2]+sortedArray[arrayLength/2])/2.0;
    }
}
