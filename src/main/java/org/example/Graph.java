package org.example;

import java.util.*;

public class Graph {
    boolean directed;
    private int V, E;
    LinkedList<Vertex>[] adj;
    public Graph(int numOfVertices, boolean directed) {
        this.directed = directed;
        V = numOfVertices;
        adj = new LinkedList[V];

        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
        Random rand = new Random(7);
        for (int v = 0; v < V*2; v++) {
            int source = rand.nextInt(V);
            int dest = rand.nextInt(V);
            addEdge(source, dest);

        }
    }

    public void addEdge(int source, int dest){
        if (source < 0 || dest < 0 || source >= V || dest >= V) return;
        if (source == dest || adj[source].contains(new Vertex(dest))) return;
        adj[source].add(new Vertex(dest));
        if (!directed && !adj[dest].contains(new Vertex(source))) adj[dest].add(new Vertex(source));
        E++;
    }

    public void addVertex(int number) {
        adj[++V] = new LinkedList<>();
    }

    public void printGraph() {
        for (int v = 0; v < V; v++) {
            System.out.println("adj[" + v + "]:" + adj[v].toString());
        }
    }

    public void dfs(){;
        boolean[] visited = new boolean[V];
        Stack<Vertex> stack = new Stack<>();
        for (int v = 0; v < V; v++){
            if (!visited[v]){
                visited[v] = true;
                stack.add(new Vertex(v));
                Vertex u = stack.getLast();
                while(!stack.isEmpty()) {
                    boolean backtrack = true;
                   for (int i = 0; i < adj[u.getId()].size(); i++) {
                       if (!visited[adj[u.getId()].get(i).getId()]) {
                           visited[adj[u.getId()].get(i).getId()] = true;
                           stack.add(adj[u.getId()].get(i));
                           u = adj[u.getId()].get(i);
                           backtrack = false;
                           break;
                       }
                   }
                   if (backtrack) {
                        stack.pop();
                        if (!stack.isEmpty()) u = stack.peek();
                   }

                }
            }
        }
    }

    public void bfs(int start){
        boolean[] visited = new boolean[V];
        visited[start]=true;
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(new Vertex(start));
        while(!queue.isEmpty()){
            Vertex u = queue.poll();
            for (int i = 0; i < adj[u.getId()].size(); i++){
                if (!visited[adj[u.getId()].get(i).getId()]){
                    visited[adj[u.getId()].get(i).getId()]=true;
                    queue.add(adj[u.getId()].get(i));
                }
            }
        }
    }

}
