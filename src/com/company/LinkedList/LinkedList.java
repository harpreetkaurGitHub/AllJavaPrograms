package com.company.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;


    //on very very first element head is the tail because there is only one element in linkedList
    public LinkedList(int value){
        this.head = new Node(value);
        tail = head;
        length = 1;
    }
}
