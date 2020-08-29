package com.company.Threadss;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ThreadWithList {
    private List names = Collections.synchronizedList(new LinkedList<>());

    public void add(String name) {
        names.add(name);
    }
    public String removeFirst() {
        if (names.size() > 0) {
            return (String) names.remove(0);
        }
        else {
            return null;
        }
    }
    public static void main(String[] args) {
        final ThreadWithList obj = new ThreadWithList();
        obj.add("adding in class obj");

        class Dropper extends Thread {
            public void run() {
                String name = obj.removeFirst();
                System.out.println(name);
            }
        }
        Thread thredObj = new Dropper();
        Thread thredObj1 = new Dropper();

        thredObj.start();
        thredObj1.start();

    }
}
