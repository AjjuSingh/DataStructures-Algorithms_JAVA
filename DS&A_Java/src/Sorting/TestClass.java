package Sorting;

public class TestClass {

	static int a[]={6,8,0,4,5,3,7,2};
	public static void main(String[] args) {
		
		Bubble b=new Bubble(a);
		b.bubble();
		Selection s=new Selection(a);
		s.Selection();
		Insertion i=new Insertion(a);
		i.insertion();
		
	}

}
