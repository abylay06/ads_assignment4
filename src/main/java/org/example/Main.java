import org.example.Graph;

void main() {
    Graph graph = new Graph(10, false);
    graph.printGraph();
    graph.bfs(0);
}