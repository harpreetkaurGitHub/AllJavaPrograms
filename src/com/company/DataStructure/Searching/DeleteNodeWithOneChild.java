package com.company.DataStructure.Searching;

public class DeleteNodeWithOneChild {
    private Node root;

    //     selection to delete
//    public boolean remove(int key) {
//        Node currentNode = root;
//        Node parentNode = root;
//
//        boolean isleftChild = false;
//        while (currentNode.key != key) {
//            parentNode = currentNode;
//            if (key < currentNode.key) {
//                isleftChild = true;
//                currentNode = currentNode.leftChild;
//            } else {
//                currentNode = currentNode.rightChild;
//                isleftChild = false;
//            }
//            if (currentNode == null) {
//                return false;
//            }
//        }
//        Node nodeToBeDelete = currentNode;
//
//        // is it is a leaf node
//        if (nodeToBeDelete.leftChild == null && nodeToBeDelete.rightChild == null) {
//            if (nodeToBeDelete == root) {
//                root = null;
//            } else if (isleftChild) {
//                parentNode.leftChild = null;
//            } else {
//                parentNode.rightChild = null;
//            }
//        }
//
//        // if node has one child
//        else if (nodeToBeDelete.rightChild == null) {
//            parentNode.leftChild = nodeToBeDelete.leftChild;
//        } else {
//            parentNode.rightChild = nodeToBeDelete.rightChild;
//        }
//
//        // Add return type by yourself here
//    }

    public static void main(String[] args) {

    }
}
