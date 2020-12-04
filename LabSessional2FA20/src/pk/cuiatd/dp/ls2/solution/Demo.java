package pk.cuiatd.dp.ls2.solution;

public class Demo {
	public static void main(String[] args) {
		DFS dfs = new DFS();
		dfs.traverse(2);
		
		System.out.println("********");
		BFS bfs = new BFS();
		bfs.traverse(2);
	}
}
