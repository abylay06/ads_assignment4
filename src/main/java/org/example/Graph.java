package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    boolean directed;
    private int V, E;
    LinkedList<Integer>[] adj;
    public Graph(int numOfVertices, boolean directed) {
        this.directed = directed;
        V = numOfVertices;
        adj = new LinkedList[V];

        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
        for (int v = 0; v < V; v++) {
            for (int u = 0; u < V; u++){
                addEdge(v, u);
            }
        }
    }

    public void addEdge(int source, int dest){
        if (source < 0 || dest < 0 || source >= V || dest >= V) return;
        if (source == dest || adj[source].contains(dest)) return;

        adj[source].add(dest);
        if (!directed) adj[dest].add(source);
        E++;
    }

    public void printGraph() {
        for (int v = 0; v < V; v++) {
            System.out.println("adj[" + v + "]:" + adj[v].toString());
        }
    }

    public void dfs(){;
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int v = 0; v < V; v++){
            if (!visited[v]){
                visited[v] = true;
                stack.add(v);
                int u = stack.lastElement();
                System.out.println(u);
                while(!stack.empty()) {
                    boolean backtrack = true;
                   for (int i = 0; i < adj[u].size(); i++) {
                       if (!visited[adj[u].get(i)]) {
                           visited[adj[u].get(i)] = true;
                           stack.add(adj[u].get(i));
                           u = adj[u].get(i);
                           System.out.println(u);
                           backtrack = false;
                           break;
                       }
                   }
                   if (backtrack) {
                        stack.pop();
                        if (!stack.empty()) u = stack.lastElement();
                   }

                }
            }
        }
    }

    public void bfs(int start){
        boolean[] visited = new boolean[V];
        visited[start]=true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int u = queue.poll();
            System.out.println(u + " ");
            for (int i = 0; i < adj[u].size(); i++){
                if (!visited[adj[u].get(i)]){
                    visited[adj[u].get(i)]=true;
                    queue.add(adj[u].get(i));
                }
            }
        }
    }

}
