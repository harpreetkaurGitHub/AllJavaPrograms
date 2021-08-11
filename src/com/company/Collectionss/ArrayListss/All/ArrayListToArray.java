package com.company.Collectionss.ArrayListss.All;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void method1() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);

//        Integer[] array = new Integer[arrayList.size()];
//        for (int i=0 ; i<arrayList.size() ; i++) {
//            array[i] = arrayList.get(i);
//            int uff = array[i];
//            System.out.println(uff);
//        }

        Integer[] array1 = (Integer[]) arrayList.toArray();

        int integer = 133;


        long longe = integer;
        System.out.println(longe);


//        for (int i: array1) {
//            System.out.println(i);
//        }


    }

    public static void main(String[] args) {

        // method1();


        ArrayList<String> stringArray = new ArrayList<String>();

        stringArray.add("2");
        stringArray.add("3");


        String valuw="1234";
        Integer va=Integer.parseInt(valuw);
        System.out.println(va);

//        Integer[] newArray = (Integer[]) stringArray.toArray();
//        for (int i : newArray) {
//            System.out.println(i);
//        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(24);
        list.add(24);
        list.add(24);
        list.add(24);
        list.add(24);
        list.add(24);
        list.add(24);
        list.add(24);
        list.add(24);
        list.add(24);

        Integer[] listArray = new Integer[list.size()];

        for (int i : list) {

            listArray[i] = list.get(i);
            System.out.println(i);
        }



    }
}
