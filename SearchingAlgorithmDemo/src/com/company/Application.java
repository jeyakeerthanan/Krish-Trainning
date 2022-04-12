package com.company;

import java.util.LinkedList;

public class Application {

    public static void main(String args[]) {
        BFS bfs = new BFS(4);

        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);

        LinkedList<Integer> adj[];
        adj= bfs.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        bfs.DoBFS(2,adj,4);

        DFS dfs = new DFS(4);

        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 0);
        dfs.addEdge(2, 3);
        System.out.println();
        System.out.println("Following is Depth First Traversal");

        dfs.DFS(2);

    }
}
