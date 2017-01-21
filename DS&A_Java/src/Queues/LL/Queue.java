package Queues.LL;

public class Queue {

	private Node front,rear;
	private int size;
	
	public Queue()
	{
		front =rear=null;
		size=0;
		
	}
	
	//Time O(1) for 1 enqueue
	public void enQueue(int data)
	{
		Node newNode=new Node(data);
		if(front==null)
		{
			front=rear=newNode;
			size++;
		}
		else
		{
			rear.setNext(newNode);
			rear=newNode;
			size++;
		}
		
	}
	
	//Time O(1) for 1 dequeue
	public Node deQueue()throws Exception
	{
		if(front==null)
		{
			throw new Exception("Queue is empty");
		}
		Node temp=front;
		front=front.getNext();
		size--;
		return temp;
	}
	
	//Time O(n)
	public void printQueue()throws Exception
	{
		Node temp=front;
		if(temp==null)
		{
			throw new Exception("Queue is empty");
		}
		String result="[ ";
		while(temp!=null)
		{
			result=result+temp.getData()+" ";
			temp=temp.getNext();
		}

		System.out.println(result+"]");
	}
	
	
	
	public Node getFront() {
		return front;
	}
	public void setFront(Node front) {
		this.front = front;
	}
	public Node getRear() {
		return rear;
	}
	public void setRear(Node rear) {
		this.rear = rear;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
