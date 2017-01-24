package Graphs.List;

public class TestClass {

	public static void main(String[] args) throws Exception {
		Graph g=new Graph(7);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 5);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 5);
		g.addEdge(4, 5);
		g.addEdge(4, 6);

		//g.removeEdge(3, 4);
		g.PrintList();
		g.DFS(6);
		

	}

}
