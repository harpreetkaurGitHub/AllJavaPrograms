package com.company.Collectionss.ArrayListss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StringArry {

    public static void StringMethodArray() {

        ArrayList<String> StringArry = new ArrayList<String>();
        ArrayList<String> StringArr = new ArrayList<String>();

        try {
            StringArry.add("Toypom");
            StringArry.add("Goat");
            StringArry.add("Banana");
            StringArry.add("Apple");
            StringArry.add("Dog");
            StringArry.add("Fish");
            StringArry.add("Carrot");

//          Collections.sort(StringArry);
//            Collections.sort(StringArry, Collections.reverseOrder());

//            for (String i:StringArry) {
//                System.out.println("String array items :"+ i);
//            }

            for(int i=StringArry.size() ; i>0 ; i--) {
                System.out.println(StringArry.get(i));
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        StringMethodArray();
    }
}
