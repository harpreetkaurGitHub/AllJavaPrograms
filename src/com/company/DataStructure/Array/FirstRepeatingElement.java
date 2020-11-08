package com.company.DataStructure.Array;

import java.util.HashSet;

public class FirstRepeatingElement {

    public static void method(int[] array) {
        int firstRepeated =-1;
        HashSet<Integer> set = new HashSet<>();

        for (int i=array.length-1; i>=0; i--) {
            if (set.contains(array[i])) {
                firstRepeated = i;
            }else {
                set.add(array[i]);
            }
        }
        if (firstRepeated!=-1){
            System.out.println(array[firstRepeated]);
        }
        else {
            System.out.println("not repeating elements");
        }
        }
    public static void main(String[] args) {
        int[] array = {10,3, 5, 3, 4, 3, 5, 6};
        method(array);
    }
}
