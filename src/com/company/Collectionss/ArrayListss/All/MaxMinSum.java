package com.company.Collectionss.ArrayListss.All;

import java.util.ArrayList;
import java.util.List;

public class MaxMinSum {

    public static void maxMin(List<Integer> arr){
        long min = 0, max = 0, sum = 0;
        min = arr.get(0);
        max = min;
        sum = min;

        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.print((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        maxMin(arr);
    }
}
