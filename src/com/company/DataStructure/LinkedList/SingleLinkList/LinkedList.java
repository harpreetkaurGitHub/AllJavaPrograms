package com.company.DataStructure.LinkedList.SingleLinkList;


import java.util.Arrays;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;


    //on very very first element head is the tail because there is only one element in linkedList
    public LinkedList(int value) {
        this.head = new Node(value);
        tail = head;
        length = 1;
    }

    //Add element to tail
    //complexity O(1)
    public void append(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    //Add element to head
    //complexity O(1)
    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    //printing List
    //complexity O(n)
    public int[] printList() {
        int[] list = new int[length];
        Node currentNode = this.head;
        int i = 0;
        while (currentNode != null) {
            list[i] = currentNode.data;
            currentNode = currentNode.next;
            i++;
        }
        return list;
    }

    //Inserting and element to specific Index
    //Complexity O(n)
    public void insert(int index, int value) {
        Node newNode = new Node(value);
        Node leaderNode = this.head;
        for (int i = 0; i < index - 1; i++) {
            leaderNode = leaderNode.next;
        }
        //bucket exchange
        Node holdingPointer = leaderNode.next;
        leaderNode.next = newNode;
        newNode.next = holdingPointer;
        length++;
    }

    //remove element from specific index
    //Complexity O(n)
    public void remove(int index) {
        Node leader = this.head;
        for (int i = 0; i < index - 1; i++) {
            leader = leader.next;
        }

        leader.next = leader.next.next;
        length--;
    }

    //reverse LinkedList
    //Complexity O(n)
    public void reverse() {
        Node firstNode = head;
        tail = head;
        Node secondNode = head.next;
        for (int i = 0; i < length - 1; i++) {
            Node tempNode = secondNode.next;
            secondNode.next = firstNode;
            firstNode = secondNode;
            secondNode = tempNode;
        }
        head.next = null;
        head = firstNode;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(50);

        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);

     /*   new Thread(()->{
            linkedList.prepend(30);
            linkedList.prepend(40);
        }).start();*/

//        linkedList.insert(2, 100);
//        linkedList.remove(3);
        System.out.println("::::::: BEFORE Reverse :::::");
        System.out.println(Arrays.toString(linkedList.printList()));

//        System.out.println("::::::::::: AFTER REVERSE :::::::::::::");
//        linkedList.reverse();
//        linkedList.prepend(/70);
//        linkedList.prepend(80);

//        System.out.println(Arrays.toString(linkedList.printList()));

    }

}
