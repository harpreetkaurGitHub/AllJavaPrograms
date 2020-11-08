package com.company.DataStructure.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void method(){
        int[] arr = {2,7,1,0,5,8,22,66,88};

        int temp;
       for (int i=0 ; i<arr.length ; i++) {
           for (int j=1 ; j<arr.length-1-i ; j++) {
               if (arr[j-1] > arr[j]) {
                   temp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] = temp;
               }
           }
       }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        method();
    }
}


// without using 3 rd variable