package com.company.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void method(int[] array) {

        int temp,j;
        for (int i=0 ; i<array.length ; i++) {
            temp = array[i];                                  //  44
            j = i;                                            //  5 --> 44

            // this is the advanced thing to represent for loop
//            for (;;) {
//                if (j>0 && array[j-1] > temp) {
//                    array[j] = array[j-1];
//                    i= j-1;
//                    break;
//                }
//                array[j] = temp;
//            }
            // end

            while (j>0 && array[j-1] > temp) {                //  77 > 44
                array[j] = array[j-1];                        //  4 = 44
                j = j-1;                                      //  5-1 = 4
            }
            array[j] = temp;                                  //  4 = 44
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {4,3,1,2} ;
        method(array);
    }
}
