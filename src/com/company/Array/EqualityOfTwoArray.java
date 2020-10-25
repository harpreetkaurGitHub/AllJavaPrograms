package com.company.Array;

public class EqualityOfTwoArray {

    public static String method(int[] arrayOne,int[] arrayTwo){
        if (arrayOne!=null && arrayTwo!=null) {
            for (int i=0;i<(arrayOne.length>arrayTwo.length?arrayOne.length:arrayTwo.length);i++){
                if (i<arrayTwo.length-1 && arrayOne[i]==arrayTwo[i]) {
                    return "true";
                }
            }
        }
      return "false";
    }

    public static void main(String[] args) {
        int[] arrayOne = {21, 57, 11, 37, 3};
        int[] arrayTwo = {1,2,3};
        System.out.println(method(arrayOne,arrayTwo));
    }
}
