package com.company.DoublyLinkedList;

public class AddAfterAGivenNode{
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
        }
    }
    public void inser_NodeAfter(Node prev_Node , int new_data){
        if (prev_Node == null) {
            System.out.println("Previous node can not be null");
        }
        Node new_Node = new Node(new_data);
        new_Node.next = prev_Node.next;
        prev_Node.next = new_Node;
        new_Node.prev = prev_Node;

        if (new_Node.next != null) {
            new_Node.next.prev = new_Node;
        }
    }

}
