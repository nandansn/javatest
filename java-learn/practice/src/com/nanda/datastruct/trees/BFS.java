package com.nanda.datastruct.trees;

import java.util.*;

public class BFS {

    private Queue<Node> queue;

    private List<Integer> visited;

    private Node node;


    public BFS() {
        this.queue = new LinkedList<>();
        this.visited = new ArrayList<>();
    }

    public int traversal(Node node) {

        if (node == null && queue.isEmpty()) {
            return 0;
        } else {
            if (node == null && !queue.isEmpty()) {
                return traversal(this.queue.poll());
            } else {
                this.visited.add(node.getValue());

                if (node.getLeft() != null) {
                    this.queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    this.queue.add(node.getRight());
                }
                return traversal(this.queue.poll());
            }

        }

    }

    public List<Integer> getVisited() {
        return this.visited;
    }



}
