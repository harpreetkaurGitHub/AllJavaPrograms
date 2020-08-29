package com.company.Collectionss.ArrayListss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AddAllCollectionCMethod {

    public static void main(String[] args) {


        List<Integer> array1 = Collections.synchronizedList(new ArrayList<Integer>());


        array1.add(23);
        array1.add(24);
        array1.add(25);
        array1.add(26);
        array1.add(27);
        array1.add(28);
        array1.add(29);
        array1.add(30);
        array1.add(28);
        array1.add(29);
        array1.add(30);
        array1.add(28);
        array1.add(29);
        array1.add(30);

        System.out.println("this is aaray1 items: " + array1);


        CopyOnWriteArrayList<Integer> array2 = new CopyOnWriteArrayList<Integer>();

        array2.add(00);
        array2.add(24);
        array2.add(25);
        array2.add(26);
        array2.add(27);
        array2.add(28);
        array2.add(29);
        array2.add(30);

        System.out.println("this is aaray2 items: " + array2);

//      array1.addAll(array2);
        array1.addAll(1,array2);
        System.out.println("This is array1 + array2 elements" + array1);


        List<Integer> subArray = array1.subList(4,7);
        System.out.println("sub Array of Array1" + subArray);

        System.out.println(array1.lastIndexOf(28));
    }
}
