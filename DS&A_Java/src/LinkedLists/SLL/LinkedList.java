package LinkedLists.SLL;

public class LinkedList {
	
	private Node head=null;
	private Node tail=null;
	private int size=0;
	
	//Time =O(1) with tail add node at the end
	public void addNode(int data )
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			tail=head;
			size++;
		}
		else
		{
		tail.next=newNode;
		tail=tail.next;
		size++;
		}
	}
	
		//Time =O(n) without tail
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
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=newNode;
				size++;
			}
		}
	
	
	//Time O(1) 
	public void addNodeAtFirst(int data)throws Exception
	{
		if(head==null)
		{
			throw new Exception("List is empty");
		}
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		size++;
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
			newNode.next=head;
			head=newNode;
			size++;
		}
		
		else if(pos>=size)
		{
			tail.next=newNode;
			tail=newNode;
			size++;
		}
		else
		{
			int count=0;
			Node temp=head;
			while(temp!=null)
			{
				if(count==pos-1)
				{
					newNode.next=temp.next;
					temp.next=newNode;
					size++;
					break;
				}
				count++;
				temp=temp.next;
			}	
		}
		
		
	}
	
	//Time O(1) 
	public void deleteNodeAtFirst()throws Exception
	{
		if(head==null)
		{
			throw new Exception("List is empty");
		}
		head=head.next;
		size--;
	}
	
	//Time O(n) as to find the tail
	public void deleteNodeAtLast()throws Exception
	{
		if(head==null)
		{
			throw new Exception("List is empty");
		}
		Node temp=head;
		while(temp.next!=tail)
		{
			temp=temp.next;
		}
		
		temp.next=null;
		tail=temp;
		size--;
	}
	
	//Time O(n)
	public void deleteMid(int pos)throws Exception
	{
		if(head==null)
		{
			throw new Exception("List is empty");
		}
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			if(count==pos-1)
			{
				temp.next=temp.next.next;
				size--;
				break;
			}
			count++;
			temp=temp.next;
		}
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
		while(temp!=null)
		{
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println("NULL");
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
