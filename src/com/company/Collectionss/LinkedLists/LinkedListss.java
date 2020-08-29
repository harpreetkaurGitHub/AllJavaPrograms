package com.company.Collectionss.LinkedLists;

import java.util.LinkedList;

public class LinkedListss {

    public static void CreateList() {

        try {
            LinkedList<String> StringList = new LinkedList<String>();

            StringList.add("first");
            StringList.add("Second");
            StringList.add("Third");
            StringList.add("Fourth");
            StringList.add("Fivth");
            StringList.add("Sixth");

            StringList.addFirst("No I am the First");
            StringList.addLast("Yes I m the last");

            StringList.removeLast();

            System.out.println(StringList);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        CreateList();
    }
}
