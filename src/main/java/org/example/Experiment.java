package org.example;

public class Experiment {
    long[] times = new long[12];
    int index = 0;

    public Experiment(){}

    public void runTraversals(Graph g){
        for (int i = 0; i < 3; i++) {
            g.dfs(0);
            g.bfs(0);
        }
        long start = System.nanoTime();
        g.dfs(0);
        long end = System.nanoTime();
        times[index++] = end - start;
        long start2 = System.nanoTime();
        g.bfs(0);
        long end2 = System.nanoTime();
        times[index++] = end2 - start2;

    }

    public void runMultipleTests() {
        Graph[] graphs = new Graph[6];
        int[] sizes = new int[]{10, 30, 100};
        for (int i = 0; i < sizes.length; i++) {
            graphs[i] = new Graph(sizes[i], true);
            graphs[i+3] = new Graph(sizes[i], false);
        }
        for (int i =0; i < graphs.length; i ++) {
            runTraversals(graphs[i]);
        }
    }

    public void printResults() {
        System.out.println("\nAbout print the results:\n");
        for (int i = 0; i < times.length; i++) System.out.println(times[i]);
    }
}
