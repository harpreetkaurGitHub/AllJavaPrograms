package com.company.Practice;

import java.util.HashMap;

public class CountWords {
    public static void countWords(String string) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] split = string.split(" ");

        for (int i =0 ; i<split.length; i++) {
                if (map.containsKey(split[i])){
                    int count = map.get(split[i]);
                    map.put(split[i],count+1);
                }
                else {
                    map.put(split[i],1);
                }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        countWords("Hello Sunny Day Hello Sunny Day");
    }
}
