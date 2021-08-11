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

//    Node deleteRec(Node root, int key)
//    {
//        /* Base Case: If the tree is empty */
//        if (root == null)
//            return root;
//
//        /* Otherwise, recur down the tree */
//        if (key < root.key)
//            root.left = deleteRec(root.left, key);
//        else if (key > root.key)
//            root.right = deleteRec(root.right, key);
//
//            // if key is same as root's
//            // key, then This is the
//            // node to be deleted
//        else {
//            // node with only one child or no child
//            if (root.left == null)
//                return root.right;
//            else if (root.right == null)
//                return root.left;
//
//            // node with two children: Get the inorder
//            // successor (smallest in the right subtree)
//            root.key = minValue(root.right);
//
//            // Delete the inorder successor
//            root.right = deleteRec(root.right, root.key);
//        }
//
//        return root;
//    }


    public Node findMin() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public final Node findMax() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
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
