package com.company.DataStructure.LinkedList.SingleLinkList;

import java.util.Arrays;

public class CRUDlinklist {
    Node head;
    Node tail;
    int length;

    public CRUDlinklist(int value) {
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

    public void insertNode(int index,int value){
        Node inserNode = new Node(value);
        Node currentNode = this.head;
        for (int i=0 ; i<index-1;i++) {
            currentNode = currentNode.next;
        }
        Node holdingNode = currentNode.next;
        currentNode.next  = inserNode;
        inserNode.next = holdingNode;
        length++;
    }

    public void removeNode(int index){
        Node startNode = this.head;
        for (int i=0 ;i<index-1;i++) {
            startNode = startNode.next;
        }
        startNode.next = startNode.next.next;
        length--;
    }

    public void preApend(int value){
        Node atStart = new Node(value);
        atStart.next = head;
        atStart = head;
        length++;
    }

    public int[] printList() {
        int[] list = new int[length];
        Node currentNode = this.head;
        int i=0;
        while (currentNode != null) {
            list[i] = currentNode.data;
            currentNode = currentNode.next;
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        CRUDlinklist cruDlinklist = new CRUDlinklist(30);

        cruDlinklist.append(40);
        cruDlinklist.append(50);
        cruDlinklist.append(540);
        cruDlinklist.append(430);
        System.out.println("Print list before :: "+ Arrays.toString(cruDlinklist.printList()));;
        cruDlinklist.insertNode(3,899);
        System.out.println("Print list remove before :: "+ Arrays.toString(cruDlinklist.printList()));;
        cruDlinklist.removeNode(4);
        cruDlinklist.preApend(59);
        System.out.println("Print list after :: " + Arrays.toString(cruDlinklist.printList()));
    }
}
