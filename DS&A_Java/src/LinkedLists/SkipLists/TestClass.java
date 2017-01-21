package LinkedLists.SkipLists;


public class TestClass {
	
	public static void main(String args[])
	{
		SkipList obj=new SkipList();
		obj.addNodeToList(100, 10);
		obj.addNodeToList(62, 20);
		obj.addNodeToList(3, 30);
		obj.traverse();
	}

}
