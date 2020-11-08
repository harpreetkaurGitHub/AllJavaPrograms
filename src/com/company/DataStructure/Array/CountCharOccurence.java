package com.company.DataStructure.Array;

import java.util.*;


public class CountCharOccurence {

    public static void main(String[] args) {
        String test = "hello how are you ";
        test = test.replaceAll(" ","");
        System.out.println(getCharOccurrences(test.toCharArray()));

    }
    public static Map<Character, Integer> getCharOccurrences(char[] arr) {
        Map<Character, Integer> occurrence = new HashMap<>();
        for (char character : arr) {
            if (occurrence.containsKey(character)) {
                int value = occurrence.get(character);
                value = value + 1;
                occurrence.put(character, value);
            } else {
                occurrence.put(character, 1);
            }
        }
        return occurrence;
    }

}
