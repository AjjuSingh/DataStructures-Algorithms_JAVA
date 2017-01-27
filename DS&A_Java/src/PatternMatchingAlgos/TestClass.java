package PatternMatchingAlgos;

public class TestClass {

	
	public static void main(String args[])
	{
		String text=   "abcbabccabcabcbcbcaaa";
		String pattern="bccabcabcbcb";
		
		BruteForce bf =new BruteForce(text,pattern);
 		bf.bruteForce();
		RobinKarp rk=new RobinKarp(text,pattern);
		rk.robinKarp();
	}
}
