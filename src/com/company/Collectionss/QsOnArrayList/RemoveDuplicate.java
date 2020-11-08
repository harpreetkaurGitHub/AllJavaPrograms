package com.company.Collectionss.QsOnArrayList;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static void removeDuplicate() {
        int[] array = {10,4,5,6,7,9,7,2,5,7,9,0,2,1,10};

//        int[] temp = new int[array.length];
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.ensureCapacity(20);

        int j = 0;
        for (int i=0 ; i<array.length ; i++) {
            if (array[i] != i+1) {
                temp.add(array[i]);
            }
        }
        for (int k : temp) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        removeDuplicate();
    }
}

//new arry = old array +( old array << 1 )