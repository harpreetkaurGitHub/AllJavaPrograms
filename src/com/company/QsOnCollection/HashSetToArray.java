package com.company.QsOnCollection;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {

    public static void method() {

        HashSet<Integer> hashset = new HashSet<Integer>();

        hashset.add(20);
        hashset.add(21);
        hashset.add(22);
        hashset.add(24);
        hashset.add(23);
        hashset.add(25);
        hashset.add(26);
        hashset.add(27);

        int[] arr = new int[hashset.size()];

//        System.out.println("Hashset to aaray -->" + hashset.toArray(arr));

        for (int k: arr) {

            System.out.println(k);
        }

        }

    public static void main(String[] args) {

        method();
    }
}
