package Sorting;

public class TestClass {

	static int a[]={9,8,0,3,7,6,4,2,1,5};
	
	public static void main(String[] args) {
		
		
		Bubble b=new Bubble(a);
		b.bubble();
		Selection s=new Selection(a);
		s.Selection();
		Insertion i=new Insertion(a);
		i.insertion();
		QuickSort q=new QuickSort(a);
		q.quick(0, a.length-1);
		q.print();
		MergeSort m=new MergeSort();
		m.mergeSort(a);
		HeapSort h=new HeapSort(a);
		h.heapSort();
		
	}

}
