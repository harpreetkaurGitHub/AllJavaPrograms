package com.company.Collectionss.ArrayListss;

public class Sorting {

    public static void method() {

        int[] arr = new int[]{1,4,2,6,7,3,9,5};
        int var = 0;

        try {
            for (int i=0 ; i<arr.length-1 ; i++) {
                if(arr[i] < arr[i+1]) {
                    var = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = var;
                    arr[0] = arr.length-1;

                }
            }
            for (int i=0 ; i<arr.length ; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        method();
    }

}
