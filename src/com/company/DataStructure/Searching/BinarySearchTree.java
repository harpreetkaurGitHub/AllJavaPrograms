package com.company.DataStructure.Searching;

public class BinarySearchTree {
    private Node root;

    public void insert(int key,String value) {
        Node newNode = new Node(key,value);

        if (root == null) {
            root = newNode;
        }
        else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                    }
                else {
                    current  = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
                }
            }

    }
    public Node findMin() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return  last;
    }

    public static void main(String[] args) {
        BinarySearchTree obj = new BinarySearchTree();
        obj.insert(10,"TEN");
        obj.insert(11,"ELEVEN");
        obj.insert(12,"TWELVE");
        obj.insert(13,"THIRTEEN");

        System.out.println(obj.findMin().key);
        System.out.println(obj.findMax().key);
    }
}
