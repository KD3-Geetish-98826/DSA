import java.util.*;

class Graph {
    private int vertices;
    private ArrayList<ArrayList<Integer>> adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    void BFS(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbour : adjList.get(current)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }

        System.out.println();
    }

    void DFS(int start) {
        boolean[] visited = new boolean[vertices];

        System.out.print("DFS Traversal: ");
        dfsRecursive(start, visited);
        System.out.println();
    }

    void dfsRecursive(int current, boolean[] visited) {
        visited[current] = true;
        System.out.print(current + " ");

        for (int neighbour : adjList.get(current)) {
            if (!visited[neighbour]) {
                dfsRecursive(neighbour, visited);
            }
        }
    }
}

public class question5 {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.BFS(0);
        g.DFS(0);
    }
}