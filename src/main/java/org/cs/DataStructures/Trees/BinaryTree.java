package org.cs.DataStructures.Trees;

public class BinaryTree {

    static class Node {
        public int data;
        public Node left;
        public Node right;
        public Node parent;

        public Node(int value) {
            left = null;
            right = null;
            parent = null;
            data = value;
        }
    }

    private Node _root;

    public BinaryTree() {
        this._root = null;
    }

    public BinaryTree(Node root) {
        this._root = root;
    }


}
