package com.company.DataStructure.LinkedList;

public class LinkedListPractise {

    private Node head;
    private  Node tail;
    int length =0;


    public LinkedListPractise(int value){
        Node node = new Node(value);
        this.head = node;
        this.tail = head;
        length++;
    }

    public void append(int value){
        Node node = new Node(value);
        this.tail.next =node;
        tail = node;
        length++;
    }
    public void prepend(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        length++;
    }

    public void insert(int value , int index){
        Node node = new Node(value);
        Node leaderNode = head;
        for(int i =0;i<=index;i++){
            leaderNode = leaderNode.next;
        }
        Node temNode = leaderNode.next;
        leaderNode.next = node;
        node.next = temNode;
        length++;
    }


}
