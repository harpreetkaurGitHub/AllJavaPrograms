package com.company.InterviewQues;

import java.util.Arrays;

public class GoogleQuesSumOfValue {

    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 14 ,-1,4};

        System.out.println(Arrays.toString(twoSum(arr, 3)));

    }

    public static int[] twoSum(int[] nums, int target) {

        int lowIndex = 0;
        int highINdex = nums.length - 1;
        int[] arr = new int[2];
        while (lowIndex < highINdex) {
            int sum = nums[lowIndex] + nums[highINdex];
            if (sum == target) {
                arr[0] = lowIndex;
                arr[1] = highINdex;
                return arr;
            }
            highINdex = highINdex - 1;
            if (lowIndex == highINdex) {
                lowIndex = lowIndex + 1;
                highINdex = nums.length - 1;
            }
        }
        return arr;
    }
}
