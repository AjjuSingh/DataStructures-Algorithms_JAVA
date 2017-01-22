package Trees.BinaryTrees;

public class BNode {

	private int data;
	private int key;
	BNode left,right;
	
	public BNode(int key,int data)
	{
		this.data=data;
		this.key=key;
		right=left=null;
	}
	public BNode(BNode d)
	{
		d=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
}
