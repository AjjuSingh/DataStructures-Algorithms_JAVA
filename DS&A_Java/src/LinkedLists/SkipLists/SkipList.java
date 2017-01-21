package LinkedLists.SkipLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SkipList {
	
	Node head,tail;
	int h=0,n=0;
	Random r;
	
	public SkipList()
	{
		head=new Node(Node.negInf,Node.negInf);
		tail=new Node(Node.posInf,Node.posInf);
		
		head.right=tail;
		tail.left=head;
		
		r=new Random();
		
	}
	//Time average is O(logn) worst O(n)
	public void addNodeToList(int k,int d)
	{
		Node newNode=new Node(k,d);
		Node temp=findPosition(k);
		
		newNode.right=temp.right;
		temp.right.left=newNode;
		temp.right=newNode;
		newNode.left=temp;
		n++;
		
		//random level increasing
		int level=0;
		
		while(r.nextDouble()<=0.5)
		{
			Node temp1,temp2;
			temp1=new Node(Node.negInf,Node.negInf);
			temp2=new Node(Node.posInf,Node.posInf);
		
			
			if(level>=h)
			{
				h=h+1;
			temp1.right=temp2;
			temp2.left=temp1;
			temp1.down=head;
			temp2.down=tail;
			head.top=temp1;
			tail.top=temp2;
			head=temp1;
			tail=temp2;
			}
		
			while(temp.top==null)
			{
				temp=temp.left;//move back towards head
			}
			temp=temp.top;
			
			Node newNode2=new Node(k,d);
			
			newNode2.right=temp.right;
			newNode2.left=temp;
			temp.right.left=newNode2;
			temp.right=newNode2;
			newNode2.down=newNode;
			newNode.top=newNode2;
			
			newNode=newNode2;//if not when level goes up new node will be adjecent to nenode
			level++;
		}
	}
			
			
			
	private Node findPosition(int k) {
		
      Node temp=head;      
	  while(true)
	  {
		while(temp.right.getKey()<=k && temp.right.getKey()!=Integer.MAX_VALUE)
		{
			temp=temp.right;
		}
		
		
		 if(temp.down!=null)
		{
			temp=temp.down;
		}
		 else 
			 break;
		
	  }
	  return temp;
	}
	
	//Time average O(logn) worst case O(n)
	public void removeNodefromList(int k)
	{
		Node temp=head;
		
		while(temp.getKey()<=k && temp.getKey()!=Integer.MAX_VALUE)
		{
			temp=temp.right;
		}
		if(temp.getKey()==k)
		{
			while(temp!=null)
			{
				temp.left.right=temp.right;
				temp.right.left=temp.left;
				temp=temp.down;
			}
		}
		else if(temp.getKey()==Integer.MAX_VALUE)
		{
			System.out.println("key is not found");
		}
		
	}
	
	
	public void traverse()
	{
		Node temp=head;
		
		Node temp1=temp;
		while(temp!=null)
		{
			while(temp1!=null)
			{
				System.out.print(temp1.getKey()+"-->");
				temp1=temp1.right;
			}
			System.out.println();
			temp1=temp.down;
			temp=temp.down;
		}
	}
	
	
}


