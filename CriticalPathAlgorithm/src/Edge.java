public class Edge {
    private final Vertex startVertex;
    private final Vertex endVertex;
    private final int weight;

    public Edge(Vertex startVertex, Vertex endVertex, int weight) {
        this.startVertex = startVertex;
        this.endVertex = endVertex;
        this.weight = weight;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public Vertex getEndVertex() {
        return endVertex;
    }

    public int getWeight() {
        return weight;
    }
}
