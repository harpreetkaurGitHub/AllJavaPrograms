package com.company.Setss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatess {

    public static void method() {
        ArrayList<Integer> aa = new ArrayList<Integer>();
        aa.add(1);
        aa.add(1);
        aa.add(1);
        aa.add(1);
        aa.add(1);
        aa.add(1);
        aa.add(1);

        Set<Integer> aar = new HashSet<Integer>();

        aar.addAll(aa);

        System.out.println(aar);

    }

    public static void main(String[] args) {

        method();
    }

}
