package Stacks.LL;

public class Stack {

	private int size=0;
	private Node top=null;
	
	//Time O(1) for 1 push 
	public void push(int data)
	{
		Node newNode =new Node(data);
		
		newNode.setNext(top);
		top=newNode;
		size++;
		
	}
	
	//Time O(1) for 1 pop 
	public Node pop()throws Exception
	{
		Node temp=top;
		if(temp==null)
		{
			throw new Exception("Stack Underflow");
		}
		top=top.getNext();
		size--;
		return temp;
	}
	
	//Time O(n)
	public void printStack()throws Exception
	{
		Node temp=top;
		if(temp==null)
		{
			throw new Exception("Stack Underflow");
		}
		while(temp!=null)
		{
			System.out.print(temp.getData()+"|");
			temp=temp.getNext();
		}
		System.out.println("NULL");
		
	}
	//Time O(n)
	public boolean contains(int data)
	{
		Node temp=top;
		while(temp!=null)
		{
			if(temp.getData()==data)
				return true;
		}
		return false;
	}
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}
}
