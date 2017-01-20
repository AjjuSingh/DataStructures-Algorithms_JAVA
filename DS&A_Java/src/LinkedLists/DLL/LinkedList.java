package LinkedLists.DLL;

public class LinkedList {
	
	private Node head,tail;
	private int size;


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
			newNode.prev=tail;
			tail=newNode;
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
					newNode.prev=temp;
					tail=newNode;
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
			head.prev=newNode;
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
				head.prev=newNode;
				head=newNode;
				size++;
			}
			
			else if(pos>=size)
			{
				tail.next=newNode;
				newNode.prev=tail;
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
						newNode.prev=temp;
						temp.next.prev=newNode;
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
			head.next.prev=null;
			head=head.next;
			
			size--;
		}
		
		//Time O(1) with tail
		public void deleteNodeAtLast()throws Exception
		{
			if(head==null)
			{
				throw new Exception("List is empty");
			}
			tail=tail.prev;
			tail.next=null;
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
					Node node=temp.next;
					
					node.prev.next=node.next;
					node.next.prev=node.prev;
					
					size--;
					break;
				}
				count++;
				temp=temp.next;
			}
		}
		
		//Time O(1) assume node is present
		public void deleteMatched(Node node)throws Exception
		{
			if(head==null)
			{
				throw new Exception("List is empty");
			}
			if(node==head)
			{
				deleteNodeAtFirst();
				return;
			}
			if(node==tail)
			{
				deleteNodeAtLast();
				return;
			}
			else
			{
				node.prev.next=node.next;
				node.next.prev=node.prev;
				size--;
			}
			
			
		}
		
		
		//Time=O(n) 
		public void travase()
		{
			Node temp=head;
			Node tail=null;
			System.out.println("one way round");
			while(temp!=null)
			{
				System.out.print(temp.data+" --> ");
				tail=temp;
				temp=temp.next;
			}
			System.out.println("NULL");
			
			System.out.println("otherway round");
			temp=tail;
			while(temp!=null)
			{
				System.out.print(temp.data+" <-- ");
				temp=temp.prev;
				
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
	

}
