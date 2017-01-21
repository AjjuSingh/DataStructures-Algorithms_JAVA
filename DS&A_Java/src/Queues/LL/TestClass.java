package Queues.LL;

public class TestClass {

	public static void main(String[] args) throws Exception {
		Queue q=new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.printQueue();
		q.deQueue();
		q.printQueue();

	}

}
