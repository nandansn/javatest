package com.nanda.datastruct.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFS {

    private Node node;

    private List<Integer> visited;

    public DFS() {
        visited = new ArrayList<>();
    }


    public int preOrder(Node node) {
        if (node != null) {
            visited.add(node.getValue());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
        return 0;
    }

    public int postOrder(Node node) {

        if (node == null) {
            return 0;
        } else {
                postOrder(node.getLeft());
                postOrder(node.getRight());
                visited.add(node.getValue());
        }



        return 0;
    }

    public List<Integer> getVisited() {
        return this.visited;
    }

    public int inOrder(Node node) {

        if (node != null)  {
            inOrder(node.getLeft());
            visited.add(node.getValue());
            inOrder(node.getRight());
        }

        return 0;
    }
}
