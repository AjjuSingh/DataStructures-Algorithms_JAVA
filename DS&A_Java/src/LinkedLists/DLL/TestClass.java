package LinkedLists.DLL;


public class TestClass {

	public static void main(String args[]) throws Exception
	{
	LinkedList obj=new LinkedList();
	obj.addNode(1);
	obj.addNode(2);
	obj.addNode(3);
	obj.addNode(4);
	obj.addNode(5);
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
