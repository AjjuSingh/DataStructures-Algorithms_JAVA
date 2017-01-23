package Heaps;

public class TestClass {

	public static void main(String[] args) {
		Heap h=new Heap();
		h.insert(67);
		h.insert(56);
		h.insert(40);
		h.insert(43);
		h.insert(76);
		h.insert(23);
		h.print();
		h.findParent(5);
		h.deletePostion(1);
		h.print();
	}

	
}
