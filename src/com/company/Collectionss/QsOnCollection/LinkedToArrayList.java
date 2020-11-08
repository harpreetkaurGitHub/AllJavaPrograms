package com.company.Collectionss.QsOnCollection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedToArrayList {

    public static void method() {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(20);

        System.out.println("Linked list" + linkedList);

        ArrayList<Integer> arrylist = new ArrayList<>(linkedList);

        System.out.println("Converted Linked list to aaray list --> " + arrylist);
    }

    public static void main(String[] args) {

        method();
    }
}
