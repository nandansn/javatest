package com.nanda.datastruct.trees;

public class Node {

    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    public int getValue() {
        return this.value;
    }
}
