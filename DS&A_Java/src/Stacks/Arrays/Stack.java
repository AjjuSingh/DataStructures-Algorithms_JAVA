package Stacks.Arrays;

public class Stack {

	private int top;
	private int stackSize;
	int s[];
	
	public Stack(int size)
	{
		top=-1;stackSize=size;
		s=new int[stackSize];
	}
	
	//Time O(1) for 1 push 
	public void push(int data)throws Exception
	{
		if(top==stackSize-1)
			throw new Exception("Stack overflow..!");
		
		s[++top]=data;
	}
	
	//Time O(1) for 1 push 
		public void pushd(int data)throws Exception
		{
			if(top==stackSize-1)
				expand();
			
			s[++top]=data;
		}
	//Time O(1) for 1 pop 
	public int pop() throws Exception
	{
		if(top==-1)
			throw new Exception("Stack underflow..!");
		int temp=s[top];
		s[top--]=0;
		return temp;
	}
	
	//Time O(n)
	public void expand()
	{
		int length=stackSize;
		length=length<<1;
		int a[]=new int[length];
		for(int i=0;i<=top;i++)
		{
			a[i]=s[i];
		}
		s=a;
	}
	
	//Time O(n)
	public boolean contains(int data)
	{
		for(int i=0;i<=top;i++)
		{
			if(s[i]==data)
				return true;

		}
		return false;
	}
	
	//Time O(n)
	public void printStack()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(s[i]);
		}
	}

	
	public int getTopData() {
		return s[top];
	}
	
	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	
}
