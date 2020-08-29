package com.company.Collectionss.ArrayListss.ComparableAndComparator;

import com.company.Collectionss.ArrayListss.ComparableAndComparator.COmparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {
    public static void main(String[] args) {

        List<COmparable> list = new ArrayList<>();

        list.add(new COmparable(24,"priya"));
        list.add(new COmparable(33,"puja"));
        list.add(new COmparable(64,"abhi"));
        list.add(new COmparable(88,"surya"));
        list.add(new COmparable(19,"zen"));
        list.add(new COmparable(56,"abeChalNa"));

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
