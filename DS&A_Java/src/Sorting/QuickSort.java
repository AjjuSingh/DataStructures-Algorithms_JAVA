package Sorting;

public class QuickSort {


		int a[];
		
		public QuickSort(int a[])
		{
			this.a=new int[a.length];
			
			for(int i=0;i<a.length;i++)
				this.a[i]=a[i];
		}
		
		//Time O(n^2)
		public void quick(int low,int high)
		{
			int pivot;
			pivot=partion(low, high);
			
			if(low<pivot)
				quick(low,pivot);
			if(pivot<high)
				quick(pivot+1,high);
				
			
			
		}
		
		private int partion(int left,int right)
		{
			int mid=a[left],temp;
			int low=left;
			while(left<right)
			{
				while(a[left]<=mid)
				{
					left++;
					if(left==a.length)
					{
						left--;
						break;
					}
						
				}
				while(a[right]>mid)
				{
					right--;
				}
				
				if(left<right)
				{
					temp=a[left];
					a[left]=a[right];
					a[right]=temp;
				}
			}
			a[low]=a[right];
			a[right]=mid;
			
			return right;
		}
		
		public void print()
		{
			System.out.print("The quick sort is : ");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}

	
}
