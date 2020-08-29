package com.company.QsOnArrayList;

public class RemoveDupli {

    public static int method() {

        int arr[] = {20,24,20,24,21,34,54,6,7,8};

        int newArr[] = new int[arr.length];
        int j = 0;

        for (int i=0 ; i<arr.length-1 ; i++) {

            if (arr[i] != arr[i+1]) {

                newArr[j++] = arr[i];

            }

        }

        for (int i=0 ; i<j ; i++ ) {
            arr[i] = newArr[i];
        }
        return j;
    }

    public static void main(String[] args) {

        method();
    }
}
