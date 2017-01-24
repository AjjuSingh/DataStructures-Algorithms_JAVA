package Graphs.List;

import java.util.ArrayList;
import java.util.List;

import LinkedLists.SLL.LinkedList;
import LinkedLists.SLL.Node;


public class Graph {

	List<LinkedList> g;
	int n;
	
	public Graph(int n)
	{
		this.n=n;
		g=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			LinkedList l=new LinkedList();
			l.addNode(i);
			g.add(l);
		}
	}
	
	//Time O(1)
	public void addEdge(int s,int d)
	{
		if(s>=0&&s<n&&d>=0&&d<n)
		{
			LinkedList l=g.get(s);
			l.addNode(g.get(d).getHead().getData());
		
			//undirected graph
			LinkedList l1=g.get(d);
			l1.addNode(g.get(s).getHead().getData());
		}
	}
	
	//Time O(v) v-no of vertices
	public void removeEdge(int s,int d) throws Exception
	{
		if(s>=0&&s<n&&d>=0&&d<n)
		{
			LinkedList l=g.get(s);
			l.deleteMatched(g.get(d).getHead());
			
			//undirected graph
			LinkedList l1=g.get(d);
			l1.deleteMatched(g.get(s).getHead());
		}
	}
	
	//Time O(V) V-no of vertices
	public boolean isEdge(int s,int d) throws Exception
	{
		if(s>=0&&s<n&&d>=0&&d<n)
		{
			LinkedList l=g.get(s);
			Node temp=l.getHead();
			while(temp!=null)
			{
				if(temp.getData()==g.get(d).getHead().getData())
				{
					return true;
				}
				temp=temp.getNext();		
			}
			return false;
		}
		else
			throw new Exception("Vertex is not present");
	}
	
	public void DFS(int i)
	{
		int visited[]=new int[n];
		int index=i,count=0;
		System.out.print("DFS is : ");
		int [] r =new int[n];
		if(callDFS(index,visited,count,r));
			r[0]=index;
		
		for (int j=0;j<n;j++)
			System.out.print(r[j]+" ");
	}
	
	private boolean callDFS(int i, int[] visited,int count,int[] r) 
	{

		visited[i]=1;
		count++;
		if(count==n)
		{
			return true;
		}
		
		Node temp=g.get(i).getHead().getNext();
		while(temp!=null)
		{
			i=temp.getData();
			if(visited[i]==0)
			{
				if(callDFS(i, visited,count,r))
				{
					r[count]=i;
			
					return true;
				}
					
				else
					visited[i]=0;
			}
			temp=temp.getNext();
			
		}
		

		return false;
		
	}

	public void PrintList()
	{
		for(int i=0;i<g.size();i++)
		{
			
			LinkedList l=g.get(i);
			l.travase();
			
		}
	}
}
