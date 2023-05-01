import java.util.*;

public class Graph {
    private final List<Vertex> vertices = new ArrayList<>();
    private final List<Edge> edges = new ArrayList<>();

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void addEdge(Edge e) {
        edges.add(e);
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public List<Vertex> computeCriticalPath() {
        // Create a map to keep track of earliest start times of each vertex
        Map<Vertex, Integer> earliestStartTimes = new HashMap<>();
        for (Vertex v : vertices) {
            earliestStartTimes.put(v, 0);
        }

        // Compute earliest start times
        for (Edge e : edges) {
            Integer earliestStartTime = earliestStartTimes.get(e.getStartVertex());
            if (earliestStartTime == null) {
                earliestStartTime = 0;
            }
            earliestStartTime += e.getWeight();
        }

        // Create a map to keep track of latest start times of each vertex
        Map<Vertex, Integer> latestStartTimes = new HashMap<>();
        for (Vertex v : vertices) {
            latestStartTimes.put(v, Integer.MAX_VALUE);
        }
        latestStartTimes.put(vertices.get(vertices.size() - 1),
                earliestStartTimes.get(vertices.get(vertices.size() - 1)));

        // Compute latest start times
        for (int i = edges.size() - 1; i >= 0; i--) {
            Edge e = edges.get(i);
            int latestStartTime = latestStartTimes.put(e.getStartVertex(), Math.min(
                    latestStartTimes.get(e.getStartVertex()), latestStartTimes.get(e.getEndVertex()) - e.getWeight()));
        }

        // Compute slack times and critical path
        List<Vertex> criticalPath = new ArrayList<>();
        for (Vertex v : vertices) {
            int slackTime = latestStartTimes.get(v) - earliestStartTimes.get(v);
            if (slackTime == 0) {
                criticalPath.add(v);
            }
        }

        return criticalPath;
    }
}