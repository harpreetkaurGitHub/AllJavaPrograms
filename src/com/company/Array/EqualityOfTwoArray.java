package com.company.Array;

public class EqualityOfTwoArray {

    public static String method(int[] arrayOne,int[] arrayTwo){
        if (arrayOne.length == arrayTwo.length && arrayOne!=null && arrayTwo!=null) {
            for (int i=0;i<arrayOne.length;i++){
                if (arrayOne[i]==arrayTwo[i]) {
                    return "Two strings are equal";
                }
                else {
                    break;
                }
            }
        }
        return "Two strings are not equal";
    }

    public static void main(String[] args) {
        int[] arrayOne = {21, 57, 11, 37, 24};
        int[] arrayTwo = {21, 57, 11, 37, 24,56};
        System.out.println(method(arrayOne,arrayTwo));
    }
}
