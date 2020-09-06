package com.company.Array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
    }

    public static void rotate(int[] nums, int k) {
        rotateArray(nums, 0, k);
    }

    public static void rotateArray(int[] arr, int times, int k) {
        if (times != k) {
            times++;
            int lastIndexElement = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = lastIndexElement;
            rotateArray(arr, times, k);
        }
        System.out.println(Arrays.toString(arr));
    }

}