import java.util.*;

class Graph {
    private int V; // Número de vértices
    private Map<Integer, List<Integer>> adjList;

    public Graph(int v) {
        V = v;
        adjList = new HashMap<>();
        for (int i = 0; i < V; i++) {
            adjList.put(i, new ArrayList<>());
        }
    }

    // Agregar una arista al grafo
    public void addEdge(int v, int w) {
        adjList.get(v).add(w);
        adjList.get(w).add(v); // Ya que es un grafo no dirigido
    }

    // Imprimir el grafo
    public void printGraph() {
        for (int v = 0; v < V; v++) {
            System.out.print("Vértice " + v + " está conectado a: ");
            for (Integer neighbor : adjList.get(v)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class GraphExample {
    public static void main(String[] args) {
        int V = 5; // Número de vértices en el grafo
        Graph graph = new Graph(V);

        // Agregar aristas al grafo
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        // Imprimir el grafo
        graph.printGraph();
    }
}