package PatternMatchingAlgos;

public class TestClass {

	
	public static void main(String args[])
	{
		String text=   "trusthardtoothbrushes";
		String pattern="shes";
		
		BruteForce bf =new BruteForce(text,pattern);
 		bf.bruteForce();
		RobinKarp rk=new RobinKarp(text,pattern);
		rk.robinKarp();
		KMP kmp=new KMP(text,pattern);
		kmp.KMP();
		BoyceMore bm=new BoyceMore(text,pattern);
		bm.badMatchTable("tooth");
		bm.bmh();
		
	}
}
