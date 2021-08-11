package com.company.Collectionss.ArrayListss.All.DS;

import java.util.Arrays;

public class LinkedList {

    Node head;
    Node tail;
    int length;

    public LinkedList(int value) {
        head = new Node(value);
        tail = head;
        length = 1;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void preaapend(int value){
        Node newNode = new Node(value);
        newNode.next = this.head;
        head = newNode;
        length++;
    }

    public void inserAt(int index,int value){
        Node newNode = new Node(value);
        Node current1 = this.head;
        for (int i=0;i<index-1;i++) {
            current1 = current1.next;
        }
        Node holding = current1.next;
        current1.next = newNode;
        newNode.next = holding;
        length++;
    }

    public void delete(int index){
        Node current = this.head;
        for (int i=0;i<index-1;i++) {
            current = current.next;
        }
        current.next = current.next.next;
        length--;
    }

    public void reverse(){
        Node current = this.head;
        tail=head;
        Node second = head.next;

        for (int i=0;i<length-1;i++){
            Node temp = second.next;
            second.next = current;
            current = second;
            second = temp;
        }
        head.next = null;
        head = current;
    }

    public int[] printList(){
        Node current = this.head;
        int[] list = new int[length];
        int i=0;
        while (current != null) {
            list[i] = current.data;
            current = current.next;
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(11);
        list.insert(12);
        list.insert(12);
        list.insert(12);
        list.insert(12);
        list.insert(12);

        list.inserAt(2,44);
        System.out.println(Arrays.toString(list.printList()));
        list.delete(5);
        System.out.println(Arrays.toString(list.printList()));
        list.reverse();
        System.out.println(Arrays.toString(list.printList()));
    }
}
