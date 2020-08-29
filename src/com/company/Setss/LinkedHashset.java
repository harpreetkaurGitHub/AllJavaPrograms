package com.company.Setss;

import java.util.LinkedHashSet;

public class LinkedHashset {

    public static void method() {

        LinkedHashSet<Integer> hashset = new LinkedHashSet<Integer>();

        hashset.add(20);
        hashset.add(22);
        hashset.add(21);
        hashset.add(25);
        hashset.add(23);
        hashset.add(24);

        System.out.println(hashset);
    }

    public static void main(String[] args) {

        method();
    }
}
