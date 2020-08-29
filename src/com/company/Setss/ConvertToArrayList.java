package com.company.Setss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertToArrayList {

    public static void method() {

        Set<Integer> aa = new HashSet<Integer>();

        aa.add(222);
        aa.add(222);
        aa.add(222);
        aa.add(222);
        aa.add(222);
        aa.add(222);

        System.out.println("Hashset  : "+ aa);

        List<Integer> arr = new ArrayList<Integer>(aa);

        System.out.println("Array list : "+ arr);
    }

    public static void main(String[] args) {

        method();
    }
}
