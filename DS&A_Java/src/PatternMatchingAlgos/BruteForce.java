package PatternMatchingAlgos;

public class BruteForce {

	String text;
	String pattern;
	
	public BruteForce(String t,String p)
	{
		this.text=t;
		this.pattern=p;
	}
	
	//Time O(TP) 
	public void bruteForce()
	{
		int t=text.length();
		int p=pattern.length();
		int j;
		for(int i=0;i<=t-p;i++)
		{
			j=0;
			while(j<p&&text.charAt(j+i)==pattern.charAt(j))
			{
				j++;
			}
			if(j==p)
			{
				System.out.println("found");
				break;
			}
		}
	
	return;	
		
	}
	
	
	
	
}
