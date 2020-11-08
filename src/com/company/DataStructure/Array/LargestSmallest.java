package com.company.DataStructure.Array;

public class LargestSmallest {
    public static void getLargestInteger(int[] array){
        int smallest = array[0];
        int largest = array[0];
        int secondSmallest=0 ;

        for (int i=0;i<array.length-1;i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
                secondSmallest = array[i]+1;
            }
        }
        System.out.println(smallest +" and second smallest :: " + secondSmallest);
        System.out.println(largest);

    }
    public static void main(String[] args) {
        int[] array = {1,3,6,4,8,5,0,2,7};
        getLargestInteger(array);

    }
}
