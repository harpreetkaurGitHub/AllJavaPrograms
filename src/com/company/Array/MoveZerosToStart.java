package com.company.Array;

import com.company.Access.Array;

import java.util.Arrays;

public class MoveZerosToStart {
    public static int[] method(int[] array){
        int[] arrayTwo = new int[array.length];
        int j=0;
        int length = arrayTwo.length-1;

        for (int i=0;i<=array.length-1;i++) {

            if (array[i] == 0) {
                arrayTwo[j] = array[i];
                j++;
            }
            else {
                arrayTwo[length] = array[i];
                length--;
            }
        }
        return arrayTwo;
    }
    public static void main(String[] args) {
        int[] array =  {12, 0, 7, 0, 3};
        int[] arr = method(array);
        for (int i=0;i<=arr.length-1;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
