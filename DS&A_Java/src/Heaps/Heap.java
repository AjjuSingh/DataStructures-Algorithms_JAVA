package Heaps;

public class Heap {

	int [] h;
	int size;
	int count=0;
	public Heap()
	{
		size=10;
		h=new int[size];
		
	}
	
	//Time O(logn)
	public void insert(int data)
	{
		int i=count;
		if(count==0)
		{
			h[i]=data;
			count++;
		}
		else
		{
			while(i>0&&data>h[(i-1)/2])
			{
				h[i]=h[(i-1)/2];
				i=(i-1)/2;
			}
			h[i]=data;
			count++;
		}
	}
	
	//Time O(logn)
	public void percolateDown(int i)//location of the node to be moved
	{
		int max=i,temp;
		int left=findLeftChild(i);
		int right=findRightChild(i);
		
		if(left!=-1&&h[i]<h[left])
			max=left;
		if(right!=-1&&h[i]<h[right])
			max=right;
		
		if(max!=i)
		{
			temp=h[i];
			h[i]=h[max];
			h[max]=temp;
		}
		
		if(left==-1&&right==-1||max==i)
		return;
		percolateDown(max);
	}
	
	//Time O(logn)
	public int deleteMax()
	{
		int data=h[0];
		h[0]=h[count-1];
		count--;
		percolateDown(0);
		return data;
	}
	//Time O(logn)
	public void deletePostion(int i)
	{
		if(i<=count)
		{
			if(findLeftChild(i)==-1 && findRightChild(i)==-1)
			{
				h[i]=0;
				count--;
			}
			else
			{
				h[i]=h[count-1];
				h[count-1]=0;
				count--;
				percolateDown(i);
			}
		}
		
	}
	
	public void print()
	{
		for (int i=0;i<h.length;i++)
			System.out.print(h[i]+" ");
	}
	
	//Time O(1)
	public int findParent(int n)
	{
		int r;
		r=(n-1)/2;
		return r;
	}
	//Time O(1)
	public int findLeftChild(int i)
	{
		int r;
		r=(2*i)+1;
		if(r>=count)
		{
		return -1;
		}
		return r;
	}
	
	//Time O(1)
	public int findRightChild(int i)
	{
		int r;
		r=(2*i)+2;
		if(r>=count)
		{
		return -1;
		}
		return r;
	}
	
}
