package com.company.QsOnArrayList;

import java.util.ArrayList;
import java.util.List;

public class Sublist {

public static void method() {

    ArrayList<Integer> arr = new ArrayList<Integer>();

    arr.add(20);
    arr.add(20);
    arr.add(20);
    arr.add(20);
    arr.add(20);
    arr.add(20);
    arr.add(20);

    System.out.println(arr);

    List<Integer> arr2 = arr.subList(2,5);

    System.out.println(arr2);



}

    public static void main(String[] args) {

    method();
    }

}
