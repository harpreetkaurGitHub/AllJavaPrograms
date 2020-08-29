package com.company.QsOnArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListMethod {


    public static void method() {

        Integer[] arr = new Integer[]{12, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> a = Arrays.asList(arr);

      ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        arr2.addAll(a);

        for (int k : a) {
            System.out.println(k);
        }
    }
    public static void main(String[] args) {

        method();
    }
}
