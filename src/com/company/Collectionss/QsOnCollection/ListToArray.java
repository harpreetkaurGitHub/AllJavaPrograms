package com.company.Collectionss.QsOnCollection;

import java.util.ArrayList;

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
