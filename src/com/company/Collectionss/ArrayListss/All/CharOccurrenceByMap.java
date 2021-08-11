package com.company.Collectionss.ArrayListss.All;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurrenceByMap {

    public static Map<Character,Integer> method(char[] characterArray){
        Map<Character,Integer> storeCharOccurrence = new HashMap<>();
        int occurred=0;

       try {
           if (characterArray!=null && characterArray.length>0){
               for (char character : characterArray){
                   if (storeCharOccurrence.containsKey(character)){
                       storeCharOccurrence.put(character,occurred++);
                   }
                   else {
                       storeCharOccurrence.put(character,1);
                   }
               }
           }
           else {
               System.out.println("NULL OR EMPTY !!");
           }
       }
       catch (Exception e) {
           e.printStackTrace();
       }
        return storeCharOccurrence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");
        String string = scanner.nextLine();
        string = string.replace(" ","").toUpperCase();
        System.out.println(method(string.toCharArray()));
        scanner.close();
    }

}
