package Trees.AVL;

public class AVLNode {

	private int data;
	AVLNode left,right;
	
	public AVLNode(int data)
	{
		this.data=data;
		left=right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
