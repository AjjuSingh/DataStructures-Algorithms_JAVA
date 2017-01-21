package LinkedLists.SkipLists;

public class Node {
	private int key;
	private int data;
	Node left,right,top,down;
	public static  int negInf = Integer.MIN_VALUE;  // -inf key value
	public static int posInf = Integer.MAX_VALUE;
	
	public Node(int key,int data)
	{
		this.key=key;
		this.data=data;
		left=null;right=null;top=null;down=null;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
