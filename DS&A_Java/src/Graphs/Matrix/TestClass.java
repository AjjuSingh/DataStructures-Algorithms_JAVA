package Graphs.Matrix;

public class TestClass {
	
	public static void main(String args[]) throws Exception
	{
		/*Graph g=new Graph(10);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(0, 4);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(1, 7);
		g.addEdge(2, 7);
		g.addEdge(3, 5);
		g.addEdge(4, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(5, 8);
		g.addEdge(8, 9);
		*/
		Graph g=new Graph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(4, 5);
		g.printGraphMatrix();
		//g.DFS(0);
		//g.BFS(0);
		//g.APSPBook(1);
		//g.APSP(1);
		g.dikjstra(0);
	}

}
