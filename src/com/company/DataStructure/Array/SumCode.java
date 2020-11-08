package com.company.DataStructure.Array;

public class SumCode {
    static int i; static int j=i+1;


    public static void method(int[] array,int length,int selectNum) {

        for (i=0;i< array.length-1;i++){

            if (j != length && (array[i] + array[j]) ==selectNum) {

                System.out.println(array[i] + " and " + array[j]);
                j++;
                method(array, length,selectNum);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        method(array, array.length-1,7);
    }
}