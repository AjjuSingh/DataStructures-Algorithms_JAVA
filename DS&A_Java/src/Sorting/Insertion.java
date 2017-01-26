package Sorting;

public class Insertion {

	int a[];
		
		public Insertion(int a[])
		{
			this.a=new int[a.length];
			
			for(int i=0;i<a.length;i++)
				this.a[i]=a[i];
		}
		
		//Time O(n^2)
		public void insertion()
		{
			int temp,index;
			for(int i=1;i<=a.length-1;i++)
			{
				temp=a[i];
				index=i;
				while(a[index-1]>temp)
				{
					a[index]=a[index-1];
					index--;
					if(index==0)
						break;
				}
				
				a[index]=temp;
			}
			print();
		}
		
		public void print()
		{
			System.out.print("The insertion sort is : ");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		
	}


