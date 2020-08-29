package com.company.LinkedList;

import com.company.Searching.Node;

public class CreateLinkedList {
    public static class Node {
        int data;
        Node next = null;
    }
    public static int listLength(Node addNode) {
        int length =0;
        Node currentNode = addNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 10;

        Node nodeB = new Node();
        nodeB.data = 25;

        Node nodeC = new Node();
        nodeC.data = 38;

        Node nodeD = new Node();
        nodeD.data = 46;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = null;

        System.out.println(listLength(nodeA));
    }
}
