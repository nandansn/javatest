package com.nanda.datastruct.graphs;

import com.nanda.datastruct.trees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DFS {

    private Node node;

    private PalGraph palGraph;

    private Map<String, ArrayList<String>> adjacencyList;

    private List<String> visited;

    public DFS(Map<String, ArrayList<String>> adjacencyList) {
        this.adjacencyList = adjacencyList;
        this.visited = new LinkedList<>();
    }

    public int traversal(String node) {

        if (this.adjacencyList.containsKey(node) && !visited.contains(node)) {
            visited.add(node);
            List<String> edges = this.adjacencyList.get(node);
            edges.forEach(v -> {
                if (!visited.contains(v)) {
                     traversal(v);
                }

            });


        }

        return 0;



    }


    public List<String> getVisited() {
        return this.visited;
    }

}
