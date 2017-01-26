package Sorting;

public class Selection {

	int a[];
	
	public Selection(int a[])
	{
		this.a=new int[a.length];
		
		for(int i=0;i<a.length;i++)
			this.a[i]=a[i];
	}
	
	//Time O(n^2)
	public void Selection()
	{
		int temp,min;
		
		for(int i=0;i<a.length;i++)
		{
			min=i;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			if(a[min]<a[i])
			{
				temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
		
		print();
		
	}
	
	public void print()
	{
		System.out.print("The Selection sort is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
