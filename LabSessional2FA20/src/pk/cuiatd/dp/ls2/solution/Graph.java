package pk.cuiatd.dp.ls2.solution;

import java.util.LinkedList;

public class Graph {
	private int vertices;
	private LinkedList<Integer> adjacencyList[];
	public Graph(int v) {
		this.vertices = v;
		adjacencyList = new LinkedList[vertices];
		for (int i = 0; i < vertices; ++i)
			adjacencyList[i] = new LinkedList<Integer>();
	}
	void addEdge(int source, int destination){
		adjacencyList[source].add(destination); // Add w to v's list.
	}
	public int getVertices() {
		return vertices;
	}
	public LinkedList<Integer>[] getAdjacencyList() {
		return adjacencyList;
	}

}
