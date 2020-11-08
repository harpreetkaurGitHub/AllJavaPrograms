package com.company.Collectionss.QsOnCollection;

import java.util.ArrayList;

public class elementExistOrNot {

    public static void method() {

        ArrayList<Integer> aaa = new ArrayList<Integer>();

        aaa.add(34);
        aaa.add(35);
        aaa.add(36);
        aaa.add(37);
        aaa.add(38);
        aaa.add(39);
        aaa.add(32);
        aaa.add(31);

        if (aaa.contains(33)) {
            System.out.println("Yes 33 exist into arraylist");
        }
        System.out.println("No 33 not exists into array list");
    }

    public static void main(String[] args) {

        method();
    }
}
