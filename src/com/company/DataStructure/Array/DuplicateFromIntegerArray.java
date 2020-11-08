package com.company.DataStructure.Array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateFromIntegerArray {

    public static Map<Integer,Integer> getDuplicateInteger(int[] array){
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<array.length-1;i++) {
            if (map.containsKey(array[i])) {
                count = map.get(array[i]);
                map.put(array[i],count++);
            }
            else {
                map.put(array[i],count++);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        int[] array = {1,4,5,3,6,7,44,8,2,8,4,5,6,9,22,3,4,5};
        System.out.println(getDuplicateInteger(array));
    }
}
