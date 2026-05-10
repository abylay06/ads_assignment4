package org.example;

public class Vertex {
    private static int id_count = 0;
    private int id;

    public Vertex(){this.id = id_count++;}

    public int getId() {return id;}

    public String toString(){return "Vertex with id of "+ id;}
}
