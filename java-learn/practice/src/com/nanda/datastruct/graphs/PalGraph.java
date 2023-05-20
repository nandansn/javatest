package com.nanda.datastruct.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PalGraph {

    private Map<String, ArrayList<String>> adjacencyList;

    public PalGraph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addPerson(String name) {
        this.adjacencyList.put(name, new ArrayList<>());
    }

    public void addEdge(String name1, String name2) throws GraphException {
        if (this.adjacencyList.containsKey(name1) && this.adjacencyList.containsKey(name2)) {
            this.adjacencyList.get(name1).add(name2);
            this.adjacencyList.get(name2).add(name1);
        } else {
            throw new GraphException("Node not found exception");
        }

    }

    public void removeEdge(String name1, String name2) throws GraphException {
        if (this.adjacencyList.containsKey(name1) && this.adjacencyList.containsKey(name2)) {
            ArrayList<String> edges1 = this.adjacencyList.get(name1);
            edges1.remove(edges1.indexOf(name2));
            ArrayList<String> edges2 = this.adjacencyList.get(name2);
            edges2.remove(edges2.indexOf(name1));
        } else {
            throw new GraphException("Node not found exception");
        }
    }

    public void removeNode(String name) throws GraphException {

        if(this.adjacencyList.containsKey(name)) {
            ArrayList<String> edges = this.adjacencyList.get(name);

            edges.forEach(node -> {
                ArrayList<String> edgess = this.adjacencyList.get(node);
                edgess.remove(edgess.indexOf(name));
            } );

            this.adjacencyList.remove(name);
        } else {
            throw new GraphException("Node not found exception");
        }
    }
}
