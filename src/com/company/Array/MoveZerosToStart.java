package com.company.Array;

import java.util.Arrays;

public class MoveZerosToStart {
    public static void method(int[] array){
        int[] arrayTwo = new int[array.length];
        int j=0;
        int temp=0;
        int count=0;
        int length = arrayTwo.length-1;

        for (int i=0;i<array.length-1;i++) {
            if (array[array.length-1] != 0) {
                temp = array[array.length-1];
            }
            if (array[i] == 0) {
                arrayTwo[j] = array[i];
                j++;
            }
            else {
                arrayTwo[length] = array[i];
                count++; length--;
            }
        }
        arrayTwo[count] = temp;
        System.out.println(Arrays.toString(arrayTwo));

    }
    public static void main(String[] args) {
        int[] array =  {12, 0, 7, 0, 8, 0, 3};
        method(array);
    }
}
