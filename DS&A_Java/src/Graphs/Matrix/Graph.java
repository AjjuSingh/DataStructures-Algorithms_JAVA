package Graphs.Matrix;

import Queues.CircularArrays.Queue;

public class Graph {
	
	int g[][];
	int noOfVertices;
	int capacity;
	public Graph(int n)
	{
		noOfVertices=n;
		g=new int[noOfVertices][noOfVertices];
	}
	
	//Time O(1)
	public void addEdge(int s,int d)
	{
		if(s>=0&&s<noOfVertices&&d>=0&&d<noOfVertices)
		{
			g[s][d]=1;
			g[d][s]=1;
		}
		else
			return;
	}
	//Time O(1)
	public void removeEdge(int s,int d)
	{
		if(s>=0&&s<noOfVertices&&d>=0&&d<noOfVertices)
		{
			g[s][d]=0;
			g[d][s]=0;
		}
		else
			return;
	}
	
	//Time O(1)
	public boolean isEdge(int s,int d)throws Exception
	{
		if(s>=0&&s<noOfVertices&&d>=0&&d<noOfVertices)
		{
			if(g[s][d]==1)
				return true;
			else
				return false;
		}
		else
		throw new Exception("Vertex is not present");
	}
	
	//Time O(n^2)
	public void printGraphMatrix()
	{
		System.out.print(" ");
		for(int k=0;k<noOfVertices;k++)
		{
			System.out.print(" ");
			System.out.print(k);
		}
			
		System.out.println();
		for(int i=0;i<noOfVertices;i++)
		{
			System.out.print(i+" ");
			for(int j=0;j<noOfVertices;j++)
			{
				System.out.print(g[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	
	public void DFS(int startIndex)
	{
		int count=0;
		int[] visited=new int[noOfVertices];
		
		callDFS(startIndex,visited,count);
	}

	private boolean callDFS(int startIndex, int[] visited,int count) 
	{
		visited[startIndex]=1;
		count=count+1;
		if(count==noOfVertices)
		{
			System.out.println(startIndex);
			return true;
		}
			
		for(int i=0;i<noOfVertices;i++)
		{
			if(g[startIndex][i]==1&&visited[i]==0)
			{
				if(!callDFS(i, visited,count))
				{
					visited[i]=0;
				}
				else
				{
					System.out.println(startIndex);
					return true;
				}

			}
			
		}
		
		return false;
	}

	
	public void BFS(int data) throws Exception
	{
		Queue q=new Queue(noOfVertices);
		int visited[]=new int[noOfVertices];
		q.enQueue(data);
		while(!q.isEmpty())
		{
			int temp=q.deQueue();
			visited[temp]=1;
			System.out.println(temp);
			for(int i=0;i<noOfVertices;i++)
			{
				if(g[temp][i]==1 && visited[i]==0)
				{
					q.enQueue(i);
					visited[i]=1;
				}
				
			}
		}
		
		
		
	}
}
