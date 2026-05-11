package org.example;

public class Vertex {
    private int id;

    public Vertex(int number){this.id = number;}

    public int getId() {return id;}

    @Override
    public boolean equals(Object o) {
        Vertex vertex = (Vertex) o;
        return id == vertex.id;
    }

    public String toString(){return "Vertex with id of "+ id;}
}
