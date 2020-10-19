package com.company.Practice;

public class SortingArray {

    public static void sort() {
        int[] array = new int[]{2, 5, 3, 1, 6, 8, 7};
        int var = 0; int i;
        for (i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    var = array[i];
                    array[i] = array[j];
                    array[j] = var;
                }
            }
        }
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        sort();
    }
}
