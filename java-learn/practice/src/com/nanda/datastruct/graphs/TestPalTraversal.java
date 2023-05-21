package com.nanda.datastruct.graphs;

public class TestPalTraversal {

    public static void main(String[] args) throws GraphException {
        PalGraph palGraph = new PalGraph();
        palGraph.addPerson("A");
        palGraph.addPerson("B");
        palGraph.addPerson("C");
        palGraph.addPerson("D");
        palGraph.addPerson("E");
        palGraph.addPerson("F");


        palGraph.addEdge("A","B");
        palGraph.addEdge("A","C");
        palGraph.addEdge("B","D");
        palGraph.addEdge("D","E");
        palGraph.addEdge("E","C");
        palGraph.addEdge("E","F");
        palGraph.addEdge("C","F");

        System.out.println(palGraph);

        DFS dfs = new DFS(palGraph.getAdjacencyList());

        dfs.traversal("A");
        //dfs.traversal("A");


        System.out.println(dfs.getVisited());


        BFS bfs = new BFS(palGraph.getAdjacencyList());

        bfs.traversal("A");

        System.out.println(bfs.getVisited());




    }
}
