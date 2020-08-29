package com.company.Collectionss.ArrayListss;

import java.util.ArrayList;
import java.util.List;

public class AddingElemetns {

    public static void addElemets(int itteration) {

        try {
            ArrayList<Object> arrayObj = new ArrayList<Object>();

            arrayObj.add(23);
            arrayObj.add(23);
            arrayObj.add(23);
            arrayObj.add(23);
            arrayObj.add(23);
            arrayObj.add(23);
            arrayObj.add(23);

            Integer[] newArray = new Integer[arrayObj.size()];
            for (int i=0 ; i < arrayObj.size() ; i++) {
                newArray[i] = (Integer) arrayObj.get(i);
            }

            List<Object> list = new ArrayList<>();
            int[] qrr= {1,2,3,4,5};
            for (int i=0 ; i<=qrr.length ; i++){
                list.add(qrr[i]);
                System.out.println(arrayObj);
                System.out.println(list.get(i));
            }
            arrayObj.add(3,588);
            arrayObj.set(4,6000);
            arrayObj.remove(6);
            for (Object arry:arrayObj) {
               System.out.println("array item :" + arry);
           }
            System.out.println(arrayObj);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        addElemets(10);

    }

}