package Stacks.Arrays;

public class TestClass {

	public static void main(String[] args) throws Exception {
		Stack s=new Stack(3);
		s.push(10);
		s.push(20);
		s.push(30);
		s.pushd(40);
		//s.pop();
		s.printStack();
		//System.out.println(s.getTopData());
	}

}
