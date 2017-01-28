package PatternMatchingAlgos;

public class TestClass {

	
	public static void main(String args[])
	{
		String text=   "abxabcabcaby";
		String pattern="abcabcaby";
		
		BruteForce bf =new BruteForce(text,pattern);
 		bf.bruteForce();
		RobinKarp rk=new RobinKarp(text,pattern);
		rk.robinKarp();
		KMP kmp=new KMP(text,pattern);
		kmp.KMP();
		
	}
}
