package com.company.Collectionss.ArrayListss.All;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayToArrayList {
    //wrapper classes
    public static void method2() {

        Integer[] intArray = {45,56,76,43,124,566};


        List<Integer> stringArray1 = Arrays.asList(intArray);
        System.out.println(stringArray1);
    }

    public static void main(String[] args) {
        method2();
    }
}