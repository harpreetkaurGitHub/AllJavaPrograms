package com.company.Collectionss.QsOnCollection;

import java.util.ArrayList;

public class SortInDesendingOrder {

    public static void method() {

        ArrayList<Integer> arr = new ArrayList<Integer>();

//        int[] arr = {34,5,3,6,531,8,9,87};
//        int newarr = 0;

        arr.add(12);
        arr.add(14);
        arr.add(15);
        arr.add(13);
        arr.add(17);
        arr.add(11);
        arr.add(19);

        System.out.println(arr);

        arr.add(2,20);    // new Qs
        System.out.println("new array --> " + arr);

        arr.remove(2);
        System.out.println("removed 2 index --> " + arr);

//        for (int i=0 ; i<arr.length-1 ; i++) {
//
//            if (arr[i] < arr[i+1]) {
//               newarr = arr[i];
//               arr[i] = arr[i+1];
//               arr[i+1] = newarr;
//            }
//        }
//
//        for (int i = 0 ; i<arr.length ; i++) {
//
//            System.out.println(arr[i]);
//        }

    }

    public static void main(String[] args) {

        method();
    }
}
