package com.company.QsOnCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static void method() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);

        Integer[] toaaray = new Integer[arrayList.size()];

        for (int k=0 ; k<arrayList.size() ; k++) {

            toaaray[k] = arrayList.get(k);
            System.out.println(toaaray[k]);
        }
    }

    public static void main(String[] args) {

        method();
    }
}
