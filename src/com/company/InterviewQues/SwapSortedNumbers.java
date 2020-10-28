package com.company.InterviewQues;

import java.util.Arrays;

public class SwapSortedNumbers {
    static int minimumSwaps(int[] arr)
    {
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {

                while (arr[i] != i + 1) {
                    int temp = 0;
                    temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;
                    count++;
                }
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,1,2};
        System.out.println(minimumSwaps(arr));
    }
}
