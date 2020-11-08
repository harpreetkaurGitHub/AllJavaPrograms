package com.company.DataStructure.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostFrequentElement {

    static void getMostFrequentElement(int inputArray[]) {
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();

        for (int i : inputArray) {
            if (elementCountMap.containsKey(i)) {
                elementCountMap.put(i, elementCountMap.get(i) + 1);
            } else {
                elementCountMap.put(i, 1);
            }
        }
        System.out.println("Actual element with values : "+elementCountMap);

        int element =0;
        int frequency = 1;

        Set<Map.Entry<Integer,Integer>> set = elementCountMap.entrySet();
        for (Map.Entry<Integer,Integer> entry : set) {
            if (entry.getValue() > frequency) {
                element = entry.getKey();
                frequency = entry.getValue();
            }
        }
        if (frequency > 1) {
            System.out.println("Most frequent element : "+ element +" times " + frequency);
        }
    }
    public static void main(String[] args) {
        int[] array = {4, 5, 8, 7, 4, 7, 6,7};
        getMostFrequentElement(array);
    }
}
