package Trees.AVL;

public class TestClass {
	
	public static void main(String args[])
	{
		AVL avl=new AVL();
		avl.insertRec(10);
		avl.insertRec(5);
		avl.insertRec(15);
		avl.insertRec(2);
		avl.insertRec(11);
		avl.insertRec(20);
		avl.insertRec(25);
		avl.deleteRec(5);
		
	}

}
