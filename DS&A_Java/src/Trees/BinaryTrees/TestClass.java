package Trees.BinaryTrees;

public class TestClass {
	public static void main(String args[]) throws Exception
	{
		BinaryTree bt=new BinaryTree();
		bt.insertRecursively(5, 10);
		bt.insertRecursively(1, 20);
		bt.insertRecursively(3, 30);
		bt.insertRecursively(6, 40);
		bt.insertRecursively(7, 50);
		bt.insertRecursively(2, 90);
		bt.preOrderNonRec();
		bt.inorderNonRec();
		bt.postOrderNonRec();
//		bt.printTree();
	}

}
