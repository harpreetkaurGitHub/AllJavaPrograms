package com.company.QsOnArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisedArray {

    public static void method() {
        List<Integer> arrayList = Collections.synchronizedList(new ArrayList<Integer>());


//        int list[] = { 45, 78, 22, 96, 10, 87, 68, 2 };

        int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array [j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void method1() {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
//        for (int i = 1; i < list.sort(); i++) {
//            if (list[i] < list[i - 1]) {
//                list[i] = list[i] + list[i - 1];
//                list[i - 1] = list[i] - list[i - 1];
//                list[i] = list[i] - list[i - 1];
//                i = 0;
//            }
//        }
//
//        System.out.print("Sorted array is : ");
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i] + " ");
//        }
//
//        Arrays.sort(a);
//        System.out.println(a);
//        System.out.println(aslistString);
//
//
        }

//

    public static void main(String[] args) {

        method();
    }
}





