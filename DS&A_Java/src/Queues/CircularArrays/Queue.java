package Queues.CircularArrays;

public class Queue {

	int front,rear,length,nodes;
	int q[];
	
	public Queue(int size)
	{
		front=0;
		rear=0;
		length=size;
		nodes=0;
		q=new int[length];
		for(int i=0;i<length;i++)
			q[i]=Integer.MAX_VALUE;
	}
	//Time O(1) for 1 enqueue
	public void enQueue(int data)throws Exception
	{
		
		if(front==0)
		{
			front=rear;
			q[rear]=data;
			nodes++;
		}
		else
		{
			q[rear]=data;
			nodes++;
		}
		rear=(rear+1)%length;
	}
	
	
	
	//Time O(1) for 1 dequeue
	public int deQueue()throws Exception
	{
		if(front==rear)
		{
			throw new Exception("Queue if empty");
		}
		
		int temp=q[front];
		q[front]=Integer.MAX_VALUE;
		nodes--;
		front=(front+1)%length;
		return temp;
	}
	
	
	public void enQueueDynamic(int data)
	{
		if(front==rear)
		{
			expand();
			q[rear]=data;
			nodes++;
		}
		else if(front==-1)
		{
			front=rear;
			q[rear]=data;
			nodes++;
		}
		else
		{
			q[rear]=data;
			nodes++;
		}
		rear=(rear+1)%length;
	}
	
	public void expand()
	{
		int newLength=length;
		newLength=newLength<<1;
		int newarray[]=new int[newLength];
		
		int temp=front;
		for(int i=0;i<nodes;i++)
		{
			newarray[temp]=q[temp];
			temp=(temp+1)%nodes;
		}
		q=newarray;
		rear=length;
		length=newLength;
	}
	
	public void printQueue()
	{
		for(int i=0;i<length;i++)
		{
			System.out.println(q[i]);
		}
	}
	
	public boolean isPresent(int data)
	{
			for(int i=0;i<q.length;i++)
				if(data==q[i])
					return true;
		return false;
	}

	public int getFront() {
		return front;
	}

	public int getRear() {
		return rear;
	}
	public boolean isEmpty()
	{
		if (front==rear)
			return true;
		return false;
		
	}

	
}
