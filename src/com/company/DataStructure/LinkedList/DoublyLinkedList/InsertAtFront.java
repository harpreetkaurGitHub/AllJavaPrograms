package com.company.DataStructure.LinkedList.DoublyLinkedList;

public class InsertAtFront {

    Node head;    // head of the list

    // creating ddl
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            d = data ;
        }
    }
    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        new_Node.prev = null;

        if (head != null) {
            head.prev = new_Node;
            head = new_Node;
        }
    }

}
