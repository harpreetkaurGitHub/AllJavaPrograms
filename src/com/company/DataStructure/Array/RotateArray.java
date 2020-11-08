package com.company.DataStructure.Array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] aray = rotate(arr, 3);
        System.out.println(Arrays.toString(aray));
    }

    public static int[] rotate(int[] nums, int k) {
        return rotateArray(nums, 0, k);
    }

    public static int[] rotateArray(int[] arr, int times, int k) {
        if (times != k) {
            times++;
            int lastIndexElement = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = lastIndexElement;
            //todo implement for loop
            rotateArray(arr, times, k);
        }
       return arr;
    }

}