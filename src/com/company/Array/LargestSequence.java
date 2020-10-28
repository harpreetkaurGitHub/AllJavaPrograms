package com.company.Array;

import java.util.Arrays;

public class LargestSequence {

    public static int getLargestSequence(int[] array){
        int count=0;int sequnce=0;
        Arrays.sort(array);
        for (int i=1;i<array.length-1;i++) {
            if (array[i]==array[i-1] +1) {
                count++;
            }
            else {
                count=1;
            }
            sequnce=Math.max(sequnce,count);
        }
       return sequnce;
    }


    public static void main(String[] args) {
        int[] array = {1,2,10,4,5,3,9,19};
        System.out.println(getLargestSequence(array));
    }
}
