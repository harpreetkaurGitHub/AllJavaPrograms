package com.company.Collectionss.QsOnArrayList;

public class RemoveIndex {

    public static void remove(int removeNum) {

        int arr[] = {1,4,6,3,7,8,3,8,5,9};

        int arr1[] = new int[arr.length];

        try{
            for (int i=0 ; i<arr.length ; i++){

                if(i!=removeNum){

                    arr1[i] = arr[i];
                    System.out.println(arr1[i]);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        remove(9);
    }
}

