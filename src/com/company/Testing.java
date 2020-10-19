//package com.company;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//
//public class Testing {
//
//    public static HashMap<Character,Integer> charOccurrence(){
//        String string = "hello this is google";
//        HashMap<Character,Integer> map = new HashMap<>();
//        string = string.replaceAll(" ", "");
//
//        for (int i=0 ;i<string.length()-1;i++) {
//            if (map.containsKey(string.charAt(i))) {
//                int count = map.get(string.charAt(i));
//                count = count+1;
//                map.put(string.charAt(i),count+1);
//            }
//            else {
//                map.put(string.charAt(i),1);
//            }
//        }
//        return map;
//    }
//
////    public static int getSmallestInteger(int[] array){
////        ay spa  (int i=0 ;i<array.length-1 ; i++) {
////            if (array[i] < array[i+1]) {
////                smallest = array[i];
////            }
////        }
////        return smallest;
////    }
//
//    public static void main(String[] args) {
//        charOccurrence();
//        System.out.println(charOccurrence());
//        int[] array = {5,2,1,6,7};
//        getSmallestInteger(array);
//        System.out.println(getSmallestInteger(array));
//    }
//}
