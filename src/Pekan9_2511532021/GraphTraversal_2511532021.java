package Pekan9_2511532021;
import java.util.*;

public class GraphTraversal_2511532021 {
	private Map<String, List<String>> graph_2021 = new HashMap<>();
	
	public void addEdge_2021(String node1_2021, String node2_2021) {
		graph_2021.putIfAbsent(node1_2021, new ArrayList<>());
		graph_2021.putIfAbsent(node2_2021, new ArrayList<>());
		graph_2021.get(node1_2021).add(node2_2021);
		graph_2021.get(node2_2021).add(node1_2021);
	}
	
	public void printGraph_2021() {
		System.out.println("Graf Awal (Adjacency List): ");
		for (String node_2021 : graph_2021.keySet()) {
			List<String> neighbors_2021 = graph_2021.get(node_2021);
			System.out.println(node_2021 + " -> " + String.join(", ", neighbors_2021));
		}
	}
	
	public void dfs_2021(String start_2021) {
		Set<String> visited_2021 = new HashSet<>();
		System.out.println("Penelususran DFS");
		dfsHelper_2021(start_2021, visited_2021);
		System.out.println();
	}

	private void dfsHelper_2021(String current_2021, Set<String> visited_2021) {
		if (visited_2021.contains(current_2021)) {
			return;
		}
		visited_2021.add(current_2021);
		System.out.print(current_2021 + " ");
		for (String neighbor_2021 : graph_2021.getOrDefault(current_2021, new ArrayList<>())) {
			dfsHelper_2021(neighbor_2021, visited_2021);
		}
	}
	
    public void bfs_2021(String start) {
        Set<String> visited_2021 = new HashSet<>();
        Queue<String> queue_2021 = new LinkedList<>();
        queue_2021.add(start);
        visited_2021.add(start);
        System.out.println("Penelusuran BFS:");
        while (!queue_2021.isEmpty()) {
            String current = queue_2021.poll();
            System.out.print(current + " ");
            for (String neighbor : graph_2021.getOrDefault(current, new ArrayList<>())) {
                if (!visited_2021.contains(neighbor)) {
                    queue_2021.add(neighbor);
                    visited_2021.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GraphTraversal_2511532021 graph_2021 = new GraphTraversal_2511532021();

        graph_2021.addEdge_2021("A", "B");
        graph_2021.addEdge_2021("A", "C");
        graph_2021.addEdge_2021("B", "D");
        graph_2021.addEdge_2021("B", "E");
        System.out.println("Graf Awal adalah: ");
        graph_2021.printGraph_2021();
        graph_2021.dfs_2021("A");
        graph_2021.bfs_2021("A");
    }
}