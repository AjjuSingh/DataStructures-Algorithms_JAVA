package Trees.BST;

public class BSTNode {

	private int data;
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	BSTNode left,right;
	
	public BSTNode(int data)
	{
		this.data=data;
		left=right=null;
	}
}
