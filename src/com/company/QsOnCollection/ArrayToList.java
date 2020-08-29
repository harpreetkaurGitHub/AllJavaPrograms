package com.company.QsOnCollection;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void method() {

        int[] arr = {1,4,3,5,6,8,3,4,5,6,9};

        List<Integer> aa = Arrays.asList(arr.length);

        System.out.println(aa);
    }

    public static void main(String[] args) {

        method();
    }
}
