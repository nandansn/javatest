package com.nanda.datastruct.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BFS {

    private List<String> queue;

    private List<String> visited;


    private Map<String, ArrayList<String>> adjacencyList;

    public BFS(Map<String, ArrayList<String>> adjacencyList) {
        this.queue = new LinkedList<>();
        this.visited = new ArrayList<>();
        this.adjacencyList = adjacencyList;
    }


    public int traversal(String node) {



        if (!this.visited.contains(node)) {
            this.visited.add(node);
            this.queue.remove(node);
            this.adjacencyList.get(node).forEach(v -> {
                if (!this.visited.contains(v) && !this.queue.contains(v)) {
                    this.queue.add(v);
                }
            });
        }

        this.queue.forEach(v -> {
            traversal(v);
        });

        return 0;
    }

    public List<String> getVisited() {
        return this.visited;
    }
}
