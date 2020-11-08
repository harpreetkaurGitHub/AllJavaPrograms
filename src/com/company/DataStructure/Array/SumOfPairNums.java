package com.company.DataStructure.Array;

public class SumOfPairNums {

    public static int getPair(int[] array,int sum){
        int count =0;

        for (int i =0 ; i<array.length-1;i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,24,5,6,7,8,3,6,9,0,1,5,7,6};
        System.out.println(getPair(array,13));
    }
}
