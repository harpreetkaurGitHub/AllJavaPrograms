package com.company.Collectionss.ArrayListss.All;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentElement {
    public static String method(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        int frequentValue=1;
        int frequentKey=0;
       try {
           if (array.length > 2){
               for (Integer i : array) {
                   if (map.containsKey(i)){
                       count = count+1;
                       map.put(i,count);
                   }
                   else {
                       map.put(i,1);
                   }
               }
               for (Map.Entry<Integer,Integer> m : map.entrySet()){
                   if (m.getValue() > frequentValue){
                       frequentValue = m.getValue();
                       frequentKey = m.getKey();
                   }
                   if (frequentValue == 1){
                       return "No frequent number ";
                   }
               }
               System.out.println(map);
               return "frequentKey: "+ frequentKey;
           }
           else {
               System.out.println("Enter valid array");
           }
       }
       catch (Exception e) {
           e.printStackTrace();
       }
        return "Enter valid array";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        System.out.println("Enter array elements:");
        int[] array = new int[size];
        for (int i=0;i<array.length;i++) {
            array[i]  = scanner.nextInt();
        }
        System.out.println(method(array));
        scanner.close();
    }
}
