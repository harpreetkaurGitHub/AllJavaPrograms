package com.company.DataStructure.Array;

import java.util.HashSet;
import java.util.Set;

public class largestSumSubArray {


    //todo fix find what is contiguous sub array
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }


    public static int maxSubArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i : nums) {
            if (set.add(i) == false) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        return sum;
    }
}
