package com.company.Searching;

public class BinarySearch {

    public static void method() {
        int[] arr = {11,22,33,44,55,67,78,99,101,213,456,789};
        int searchElement = 22;
        int li = 0;
        int hi = arr.length-1;
        int mid = (li + hi) / 2;

       while (li <= hi) {
           if (arr[mid] == searchElement) {
               System.out.println("Your Element is at position :: " + mid);
               break;
           }
           else if(arr[mid] < searchElement) {
               li = mid + 1;
           }
           else {
               hi = mid - 1;
           }
           mid = (li + hi) / 2;
       }
       if (li > hi) {
           System.out.println("sorry element not found");
       }
       }

    public static void main(String[] args) {
        method();
    }
}
