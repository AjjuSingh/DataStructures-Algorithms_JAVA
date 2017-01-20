package LinkedLists.SLL;

public class ClientTestClass {

	public static void main(String args[]) throws Exception
	{
		LinkedList obj=new LinkedList();
		obj.addNode(10);
		obj.addNode(20);
		obj.addNode(30);
		obj.addNode(40);
		obj.addNode(50);
		obj.addNodeAtFirst(5);
		obj.addNodePos(25, 3);
		obj.travase();
		obj.deleteNodeAtFirst();
		obj.travase();
		obj.deleteNodeAtLast();
		obj.travase();
		obj.deleteMid(1);
		obj.travase();
		
		Node n=new Node(10);
		obj.deleteMatched(obj.getHead());
		obj.travase();
		
	}
}
