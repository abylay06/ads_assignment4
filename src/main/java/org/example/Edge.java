package org.example;
import org.example.Vertex;
public class Edge {
    private Vertex source;
    private Vertex dest;

    public Edge(Vertex source, Vertex dest) {
        this.source = source;
        this.dest = dest;
    }

    public Vertex getSource() {return source;}
    public Vertex getDest() {return dest;}

    public String toString() {return "This is an edge from vertex "+ source +" to vertex "+dest;}
 }
