package pk.cuiatd.dp.ls2.solution;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class TraversalAlgorithm {
	protected Graph graph;
	public void createGraph(){
		graph = new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
	}
	public abstract ArrayList<Integer> traverseGraph(int startingVertex);
	
	public final void printTraversalOrder(ArrayList<Integer> order){
		Iterator<Integer> iterator = order.iterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next()+ " ");
		}
	}
	
	public final void traverse(int startingVertex){
		//hook method for creating a graph
		createGraph();
		int start = startingVertex;
		if(start<0||start>graph.getVertices()-1)
			start = 0;
		//abstract method
		ArrayList<Integer> order = traverseGraph(start);
		//concrete method to print the graph
		printTraversalOrder(order);
		
	}
}
