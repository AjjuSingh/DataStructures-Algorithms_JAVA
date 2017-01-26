package Sorting;

import Heaps.Heap;

public class HeapSort {

	
	int a[];
	Heap h=new Heap();
	
	
	public HeapSort(int a[])
	{
		this.a=new int[a.length];
		
		for(int i=0;i<a.length;i++)
			this.a[i]=a[i];
	}
	
	
	public void heapSort()
	{
		for(int i=0;i<a.length;i++)
		{
			h.insert(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			int value=h.deleteMin();
			a[i]=value;
		}
		
		print();
	}
	
	
	public void print()
	{
		System.out.print("The heap sort is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
