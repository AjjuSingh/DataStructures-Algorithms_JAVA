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
	
	public void PrintList()
	{
		for(int i=0;i<g.size();i++)
		{
			
			LinkedList l=g.get(i);
			l.travase();
			
		}
	}
}
