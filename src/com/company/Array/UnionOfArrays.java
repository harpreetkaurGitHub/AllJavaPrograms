package com.company.Array;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfArrays {
    public static void getUnionArray(int[] ... unionArrays){
        HashSet<Integer> unionSet = new HashSet<Integer>();
        for (int[] array : unionArrays) {
            System.out.println("Input Array : " + Arrays.toString(array));
            for (int i : array) {
                unionSet.add(i);
            }
        }
        System.out.println("Union Set :: "+unionSet);
    }
    public static void main(String[] args)
    {
        int[] inputArray1 = {2, 3, 4, 7, 1};

        int[] inputArray2 = {4, 1, 3, 5};

        int[] inputArray3 = {8, 4, 6, 2, 1};

        int[] inputArray4 = {7, 9, 4, 1};

        getUnionArray(inputArray1, inputArray2, inputArray3, inputArray4);
    }
}
