package pk.cuiatd.dp.ls2.solution;

import java.util.ArrayList;
import java.util.Iterator;

public class DFS extends TraversalAlgorithm{
	private ArrayList<Integer> order = new ArrayList<Integer>();

	@Override
	public ArrayList<Integer> traverseGraph(int startingVertex) {
		// Mark all the vertices as 
		// not visited(set as
		// false by default in java)
		int vertices = graph.getVertices();
		boolean visited[] = new boolean[vertices];

		// Call the recursive helper 
		// function to print DFS
		// traversal
		DFSUtil(startingVertex, visited);
		return order;

	}
	// A function used by DFS
	void DFSUtil(int v, boolean visited[])
	{
		
		// Mark the current node as visited and print it
		visited[v] = true;
		//System.out.print(v + " ");
		order.add(v);

		// Recur for all the vertices adjacent to this
		// vertex
		Iterator<Integer> i = graph.getAdjacencyList()[v].listIterator();
		while (i.hasNext()) 
		{
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}

}
