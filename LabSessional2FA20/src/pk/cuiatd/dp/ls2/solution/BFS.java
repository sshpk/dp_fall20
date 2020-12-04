package pk.cuiatd.dp.ls2.solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BFS extends TraversalAlgorithm{

	@Override
	public ArrayList<Integer> traverseGraph(int startingVertex) {
		ArrayList<Integer> order = new ArrayList<Integer>();
		// Mark all the vertices as not visited(By default 
		// set as false) 
		int vertices = graph.getVertices();
		boolean visited[] = new boolean[vertices]; 

		// Create a queue for BFS 
		LinkedList<Integer> queue = new LinkedList<Integer>(); 

		// Mark the current node as visited and enqueue it 
		visited[startingVertex]=true; 
		queue.add(startingVertex); 

		while (queue.size() != 0) 
		{ 
			// Dequeue a vertex from queue and print it 
			int head = queue.poll(); 
			//System.out.print(head+" "); 
			order.add(head);
			// Get all adjacent vertices of the dequeued vertex s 
			// If a adjacent has not been visited, then mark it 
			// visited and enqueue it 
			Iterator<Integer> i = graph.getAdjacencyList()[head].listIterator(); 
			while (i.hasNext()) 
			{ 
				int n = i.next(); 
				if (!visited[n]) 
				{ 
					visited[n] = true; 
					queue.add(n); 
				} 
			} 
		} 
		return order;
	}

}
