package com.nanda.datastruct.graphs;

import java.util.ArrayList;

public class TestPalGraph {

    public static void main(String[] args) throws GraphException {
        PalGraph palGraph  = new PalGraph();
        palGraph.addPerson("nanda");
        palGraph.addPerson("karthik");
        palGraph.addPerson("naveen");
        palGraph.addPerson("kumar");

        palGraph.addEdge("nanda","karthik");
        palGraph.addEdge("nanda","naveen");
        palGraph.addEdge("nanda","kumar");

        palGraph.addEdge("karthik","kumar");
        palGraph.addEdge("kumar","naveen");

        System.out.println(palGraph);

        palGraph.removeEdge("nanda","karthik");

        System.out.println(palGraph);

        palGraph.removeNode("nanda");

        System.out.println(palGraph);
    }


}
