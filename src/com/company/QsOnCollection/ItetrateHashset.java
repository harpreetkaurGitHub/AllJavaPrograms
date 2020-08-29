package com.company.QsOnCollection;

import java.util.HashSet;
import java.util.Set;

public class ItetrateHashset {

    public static void method() {

        Set<Integer> set = new HashSet<Integer>();

        set.add(20);
        set.add(21);
        set.add(22);
        set.add(23);
        set.add(24);
        set.add(25);
        set.add(26);

        for (int k : set ) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {

        method();
    }
}
