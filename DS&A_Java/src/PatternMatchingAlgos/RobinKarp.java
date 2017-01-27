package PatternMatchingAlgos;

import com.sun.nio.sctp.Association;

public class RobinKarp {

	String text;
	String pattern;
	
	public RobinKarp(String t,String p)
	{
		this.text=t;
		this.pattern=p;
	}
	//Time O(T+P)
	public void robinKarp()
	{
		int t=text.length();
		int p=pattern.length();
		int p_h=getHashValue(pattern);
		
		for(int i=0;i<=t-p;i++)
		{
			String substring=text.substring(i, i+p);
			if(getHashValue(substring)==p_h)
			{
				if(applyBruteForce(substring, pattern))
				{
					System.out.println("found");
					break;
				}
			}
		}
		return;
	}
	
	private int getHashValue(String p)
	{
		
		int value=0;
		for(int i=0;i<p.length();i++)
		{
			char c=p.charAt(i);
			value=value+(getValue(c)*3^i);
		}
		
		return value;
	}
	
	
	public boolean applyBruteForce(String text,String pattern)
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
				return true;
			}
		}
	
	return false;	
		
	}
	
	private int getValue(char c)
	{
		if(c=='a')
			return 3;
		else if(c=='b')
			return 7;
		else if(c=='c')
			return 11;
		else if(c=='d')
			return 17;
		
		return -1;
	}
}
