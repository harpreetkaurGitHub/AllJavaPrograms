package com.company.Setss;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Hashsets {

    public static void method() {

        Set<Integer> aa = Collections.synchronizedSet(new HashSet<>());

        aa.add(24);
        aa.add(20);
        aa.add(20);
        aa.add(20);
        aa.add(20);
        aa.add(20);
        aa.add(20);
        aa.add(null);
        aa.add(null);
        aa.add(null);
        aa.add(null);

        System.out.println(aa);

        Integer[] arr = new Integer[aa.size()];

        aa.toArray(arr);

        System.out.println(aa);
    }

    public static void main(String[] args) {

        method();
    }
}
