package com.nanda.datastruct.trees;

public class NandaTree {

    private Node root;

    public NandaTree() {
        this.root = null;
    }

    public void setRoot(Node node) {
        this.root = node;
    }

    public void insert(Node node) {
        if (this.root == null) {
            this.root = node;
        } else {
            traverse(this.root, node);
        }
    }

    public Node getRoot() {
        return this.root;
    }

    private Node traverse(Node parent, Node node) {

        if (parent.getLeft() == null) {
            if (parent.getValue() > node.getValue()) {
                parent.setLeft(node);
                return node;
            }
        } else {
            if (parent.getValue() > node.getValue()) {
                return traverse(parent.getLeft(), node);
            }
        }
        if (parent.getRight() == null) {
            if (parent.getValue() < node.getValue()) {
                parent.setRight(node);
                return node;
            }
        } else {
            if (parent.getValue() < node.getValue()) {
                return traverse(parent.getRight(), node);
            }
        }
        return null;
    }

    public boolean isNodeExist(Node node) {
        return findNode(this.root, node);
    }

    private boolean findNode(Node parent, Node node) {

        if (parent == null) {
            return false;
        }

        if (parent.getValue() == node.getValue()) {
            return true;
        } else if (node.getValue() > parent.getValue()) {
            return findNode(parent.getRight(), node);
        } else if (node.getValue() < parent.getValue()) {
              return  findNode(parent.getLeft(), node);
        }

        return false;

    }
}
