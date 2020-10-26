package com.company.Stack;

public class StackUsingLinkedList {

    private Node top;
    private Node bottom;
    private int length;

    public StackUsingLinkedList() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.top = newNode;
            this.bottom = newNode;
        } else {
            Node holdingPointer = this.top;
            this.top = newNode;
            this.top.next = holdingPointer;
        }
        this.length++;
    }

    public int peek() {
        return this.top.value;
    }

    public void pop() {
        if (this.top == null) {
            throw new NullPointerException("Null or empty Stack");
        }
        if (this.top == this.bottom) {
            this.bottom = null;
        }
        //for garbage collector
        Node holdingPointer = this.top;
        this.top = this.top.next;
        this.length--;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(40);
        stackUsingLinkedList.push(50);
        stackUsingLinkedList.push(60);

        System.out.println(stackUsingLinkedList.peek());

        stackUsingLinkedList.pop();

        System.out.println(stackUsingLinkedList.peek());

    }
}
