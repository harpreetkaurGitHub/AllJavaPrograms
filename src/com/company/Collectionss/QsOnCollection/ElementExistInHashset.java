package com.company.Collectionss.QsOnCollection;

import java.util.HashSet;

public class ElementExistInHashset {

    public static void method() {

        HashSet<Integer> set = new HashSet<Integer>();

        set.add(23);
        set.add(25);
        set.add(33);
        set.add(56);
        set.add(23);
        set.add(55);
        set.add(12);
        set.add(58);

        if (set.contains(67)) {
            System.out.println("67 exists");
        }
        System.out.println("not exists");

     }

    public static void main(String[] args) {

        method();
    }
}
