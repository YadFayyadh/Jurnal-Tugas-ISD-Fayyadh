import java.util.*;

public class AdjacencyList {
    private Map<String, List<String>> adjListMap; 

    public AdjacencyList() {
        this.adjListMap = new HashMap<>();
    }

    public void addVertex(String graphTakBerarah) {
        adjListMap.putIfAbsent(graphTakBerarah, new LinkedList<>());
    }

    public void addEdge(String vertices, String dest) {
        this.addVertex(vertices);
        this.addVertex(dest);
        
        adjListMap.get(vertices).add(dest);
        adjListMap.get(dest).add(vertices);
    }

    public void printGraph() {
        for (Map.Entry<String, List<String>> entry : adjListMap.entrySet()) {
            System.out.print("Vertex " + entry.getKey() + " is connected to: ");
            for (String vertex : entry.getValue()) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList();
        graph.addEdge("A", "D");
        graph.addEdge("A", "E");
        graph.addEdge("A", "B");
        graph.addEdge("B", "E");
        graph.addEdge("C", "B");
        graph.addEdge("D", "G");
        graph.addEdge("E", "H");
        graph.addEdge("E", "F");
        graph.addEdge("E", "F");
        graph.addEdge("F", "H");
        graph.addEdge("F", "C");
        graph.addEdge("G", "H");
        graph.addEdge("H", "I");
        graph.addEdge("I", "F");
        graph.printGraph();
    }
}
