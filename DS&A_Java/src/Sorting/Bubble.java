package Sorting;

public class Bubble {

	int a[];
	
	public Bubble(int a[])
	{
		this.a=new int[a.length];
		
		for(int i=0;i<a.length;i++)
			this.a[i]=a[i];
	}
	
	//Time O(n^2)
	public void bubble()
	{
		int temp;
		boolean swapped=true;
		
		for(int count=0;swapped&&count<a.length;count++)
		{
			
			swapped=false;
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped=true;
				}
			}
			
			
		}
		print();
	}
	
	public void print()
	{
		System.out.print("The Bubble sort is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
