package com.company.LinkedList;


import java.util.Arrays;

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

    public void append(int value){
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }
    public int[] printList(){
        int[] list = new int[length];
        Node currentNode = this.head;
        int i = 0;
        while (currentNode!=null){
            list[i] = currentNode.data;
            currentNode = currentNode.next;
            i++;
        }
        return list;
    }
    public void insert(int index,int value){
        Node newNode = new Node(value);
        Node leaderNode=this.head;
        for(int i =0;i<index-1;i++){
            leaderNode = leaderNode.next;
        }
        Node holdingPointer = leaderNode.next;
        leaderNode.next = newNode;
        newNode.next = holdingPointer;
        length++;
    }
    public void remove(int index){
        Node leader = this.head;
        for(int i =0;i<index -1;i++){
            leader = leader.next;
        }
        leader.next = leader.next.next;
        length--;
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

        linkedList.insert(2, 100);
        linkedList.remove(3);
//        linkedList.prepend(/70);
//        linkedList.prepend(80);

        System.out.println(Arrays.toString(linkedList.printList()));

    }


}
