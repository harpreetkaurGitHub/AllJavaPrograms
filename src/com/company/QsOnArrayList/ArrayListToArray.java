package com.company.QsOnArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

    public static void method() {

        ArrayList<Integer> array = new ArrayList<Integer>();


        array.add(20);
        array.add(20);
        array.add(20);
        array.add(20);
        array.add(20);
        array.add(20);
        array.add(20);
        array.add(20);
        array.add(20);
        array.add(20);


        Integer[] newArray = new Integer[array.size()];

        for (int i=0 ; i<array.size() ; i++) {

            newArray[i] = array.get(i);

            System.out.println(newArray[i]);

        }
    }

    public static void main(String[] args) {

        method();
    }
}
