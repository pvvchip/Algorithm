package com.home.lesson_7;

public class Main_7 {
    public static void main(String[] args) {
        Graph g = new Graph(10);

        //0 1-3
        //1 0-2-3
        //2 1-2
        //3 0-1-6
        //4 2-7-8
        //5 9
        //6 3-8
        //7 4-8
        //8 6-4-7
        //9 5

        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 3);
        g.addEdge(3, 6);
        g.addEdge(6, 8);
        g.addEdge(8, 4);
        g.addEdge(8, 7);
        g.addEdge(4, 7);
        g.addEdge(4, 2);

        g.addEdge(5, 9);

        DepthFirstPaths dfs = new DepthFirstPaths(g, 0);
        System.out.println(dfs.hasPathTo(5));
        System.out.println(dfs.hasPathTo(7));
        System.out.println(dfs.pathTo(7));
        BreadthFirstPaths bfs = new BreadthFirstPaths(g, 0);
        System.out.println(bfs.hasPathTo(5));
        System.out.println(bfs.hasPathTo(7));
        System.out.println(bfs.pathTo(7));
        System.out.println(bfs.distTo(7));
    }
}
