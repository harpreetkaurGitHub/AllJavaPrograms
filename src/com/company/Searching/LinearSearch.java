package com.company.Searching;

public class LinearSearch {

    public static void method(String seachItem) {
        int[] arr = {2,3,5,6,8,9};
        String[] stringArray = {"sdfgg,rth,yyyy,www,ccccc,jjjj"};

//        for (int i=0 ; i<arr.length ; i++) {
//            if (arr[i] == seachItem) {
//                System.out.println("your element is at position :: " + i);
//            }
//            else {
//                System.out.println("item not found at :: " + i);
//            }
//        }


        for (int i=0 ; i<stringArray.length ; i++) {
            if (stringArray[i].equals(seachItem)) {
                System.out.println("your item is at :: " + i);
            }
            else {
                System.out.println("item not found");
            }
        }
    }

    public static void main(String[] args) {
//        method(8);
        method("ffffff");
    }
}
