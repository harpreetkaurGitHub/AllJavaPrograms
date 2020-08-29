package com.company.Udemy.Challenges;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public  void reverse(int[] array) {
        int maxIndex = array.length-1;
        int halfIndex = array.length / 2;

        for (int i=0 ; i<halfIndex ; i++) {
            int var = array[maxIndex-i];
            array[maxIndex-i] = array[i];
            array[i] = var;
        }
    }

    public static void main(String[] args) {
          int[]  array={1,2,4,5,7,8,5,10,3};
       ReverseArrayChallenge reverseArrayChallenge = new ReverseArrayChallenge();
        System.out.println("array before "+Arrays.toString(array));

        reverseArrayChallenge.reverse(array);

        System.out.println("array before "+Arrays.toString(array));
    }
}
