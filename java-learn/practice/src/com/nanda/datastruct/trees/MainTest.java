package com.nanda.datastruct.trees;



public class MainTest {
    public static void main(String[] args) {
        NandaTree tree = new NandaTree();

        tree.insert(new Node(10));
        tree.insert(new Node(20));
        tree.insert(new Node(8));
        tree.insert(new Node(21));
        tree.insert(new Node(11));
        tree.insert(new Node(9));
        tree.insert(new Node(7));

        System.out.println(tree);

        System.out.println(tree.isNodeExist(new Node(212)));

        BFS bfs = new BFS();

        bfs.traversal(tree.getRoot());

        System.out.println(bfs.getVisited());

        DFS dfs = new DFS();

        dfs.preOrder(tree.getRoot());

        System.out.println(dfs.getVisited());

        dfs = new DFS();

        dfs.postOrder(tree.getRoot());

        System.out.println(dfs.getVisited());

        dfs = new DFS();

        dfs.inOrder(tree.getRoot());

        System.out.println(dfs.getVisited());

    }
}
