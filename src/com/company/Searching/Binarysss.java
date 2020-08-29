package com.company.Searching;

public class Binarysss {

    public static void method(){
        int[] arr = {1,5,7,8,44,66,89};
        int li = 0;
        int seachItem = 44;
        int hi = arr.length-1;
        int mid = (li+hi) / 2;

        while (li <= hi) {
            if (arr[mid] == seachItem) {
                System.out.println("your item is at position :: " + mid);
            }
            else if(arr[mid] < seachItem) {
                li = mid + 1;
            }
            else {
                hi = mid - 1;
            }
            mid = (li + hi) / 2;
        }
        if (li > hi) {
            System.out.println("element not found");
        }
    }

    public static void main(String[] args) {
        method();
    }
}
