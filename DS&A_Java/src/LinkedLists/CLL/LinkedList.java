package LinkedLists.CLL;

public class LinkedList {
	
	private Node head=null;
	private Node tail=null;
	private int size=0;
	
	//Time =O(n) add node at the end before head
	public void addNode(int data )
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			size++;
		}
		else
		{
		Node temp=head;
		while(temp.next!=head)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=head;
		size++;
		}
	}
	
		//Time =O(n) 
		public void addNodeAtLast(int data )throws Exception
		{
			Node newNode=new Node(data);
			
			if(head==null)
			{
				throw new Exception("List is empty");
				
			}
			else
			{
				Node temp=head;
				while(temp.next!=head)
				{
					temp=temp.next;
				}
				temp.next=newNode;
				newNode.next=head;
				size++;
			}
		}
	
	
	//Time O(n)  
	public void addNodeAtFirstAsHead(int data)throws Exception
	{
     //same as earlier but we get new head in this case
		Node newNode=new Node(data);
		
		if(head==null)
		{
			throw new Exception("List is empty");
			
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.next=head;
			head=newNode;
			size++;
		}
	
	}
	
	
	//Time=O(n) add node at given position
	public void addNodePos(int data,int pos)throws Exception
	{
		if(head==null)
		{
			throw new Exception("List is empty");
		}
		Node newNode=new Node(data);
		if(pos<=0)
		{
			addNodeAtFirstAsHead(newNode.data);
		}
		
		else
		{
			int count=1;
			Node temp=head;
			while(temp.next!=head)
			{
				
				if(count==pos)
				{
					newNode.next=temp.next;
					temp.next=newNode;
					size++;
					break;
				}
				count++;
				temp=temp.next;
			}	
			if(temp.next==head)
			{
				addNodeAtLast(newNode.data);
			}
		}
		
		
	}
	
	//Time O(n) as to find the tail to loop
	public void deleteNodeHead()throws Exception
	{
		if(head==null)
		{
			throw new Exception("List is empty");
		}
		Node temp=head;
		while(temp.next!=head)
		{
			temp=temp.next;
		}
		head=head.next;
		temp.next=head;
		size--;
	}
	
	//Time O(n) before head
	public void deleteNodeAtLast()throws Exception
	{
		if(head==null)
		{
			throw new Exception("List is empty");
		}
		Node temp=head;
		Node cur=null;
		while(temp.next!=head)
		{
			cur=temp;
			temp=temp.next;
		}
		
		cur.next=head;
		size--;
	}
	
	//Time O(n)
	public void deleteMid(int pos)throws Exception
	{
		if(head==null)
		{
			throw new Exception("List is empty");
		}
		if(pos>=getSize())
		{
			throw new Exception("Limit exceeded");
		}
		int count=1;
		Node temp=head;
		while(temp.next!=head)
		{
			if(count==pos)
			{
				temp.next=temp.next.next;
				size--;
				break;
			}
			count++;
			temp=temp.next;
		}
	}
	
	public boolean cointains(int data)
	{
		Node temp=head;
		while(temp.next!=head)
		{
			if(temp.data==data)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	
	//Time O(n) 
	public void deleteMatched(Node node)throws Exception
	{
		if(head==null)
		{
			throw new Exception("List is empty");
		}
		Node temp=head;
		
		if(node==head)
		{
			head=head.next;
			size--;
			return;
		}
		if(node==tail)
		{
			deleteNodeAtLast();
		return;
		}
		while(temp!=null)
		{
			if(temp.next==node)
			{
				temp.next=temp.next.next;
				size--;
				break;
			}
			
			temp=temp.next;
		}
		if(temp==null)
		{
			System.out.println("Node not found in he list");
		}
	}
	
	
	//Time=O(n) 
	public void travase()
	{
		Node temp=head;
		System.out.print(temp.data+" --> ");
		while(temp.next!=head)
		{
			temp=temp.next;
			System.out.print(temp.data+" --> ");
			
		}
		System.out.println();
	}

	
	
	
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

		
	
	
}//Main
