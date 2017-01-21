package Queues.CircularArrays;

public class TestClass {

	public static void main(String args[])throws Exception
	
	{
		Queue q=new Queue(3);
		q.enQueue(10);
		q.printQueue();
		System.out.println();
		q.enQueue(20);
		q.printQueue();
		System.out.println();
		q.enQueue(30);
		q.printQueue();
		System.out.println();
		
		
		q.deQueue();
		q.printQueue();
		System.out.println();
		q.enQueue(40);
		q.printQueue();
		System.out.println();
		q.deQueue();
		q.printQueue();
		System.out.println();
		q.enQueue(50);
		q.printQueue();
		System.out.println();
		q.deQueue();
		q.printQueue();
		System.out.println();
		q.enQueue(60);
		q.printQueue();
		System.out.println();
		//q.deQueue();
		//q.enQueue(100);
		//q.enQueue(2);
		q.enQueueDynamic(100);
		q.enQueueDynamic(200);
		q.deQueue();
		
	}
}
