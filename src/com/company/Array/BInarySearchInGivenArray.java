package com.company.Array;

public class BInarySearchInGivenArray {
    public static void method(int[] array){
        int searchElement = 33;
        int li = 0;
        int hi = array.length-1;
        int mid = (li + hi) /2;

        while (li<=hi) {
            if (array[mid] == searchElement) {
                System.out.println("Element at position :: " + mid);
                break;
            }
            else if(array[mid] < searchElement) {
                li = mid + 1;
            }
            else {
                hi = mid - 1 ;
            }
            mid = (li + hi)/2;
        }
        if (li>hi) {
            System.out.println("array not found");
        }

    }
    public static void main(String[] args) {
        int[] array = {10,14,19,26,27,31,33,35,42,44,56};
        method(array);

    }
}
