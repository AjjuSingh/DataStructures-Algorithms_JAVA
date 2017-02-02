package PatternMatchingAlgos;

import java.util.Map;
import java.util.TreeMap;

public class BoyceMore {

	String text;
	String pattern;
	int tl,pl;
	public BoyceMore(String t,String p)
	{
		this.text=t;
		this.pattern=p;
		tl=t.length();
		pl=p.length();
	}
	
	Map<Character,Integer> mp=new TreeMap<Character, Integer>();
		
	public void badMatchTable(String p)
	{
		int l=p.length();
		int value,index;
		
		for(index=0;index<p.length()-1;index++)
		{
			value=l-index-1;
			mp.put(p.charAt(index), value);
		}
		mp.put(p.charAt(index), l);
		mp.put('*', l);
	}
	
	public void bmh()
	{
		badMatchTable(pattern);
		int i=pl-1,j=i;
		while(j>=0 && i<=tl)
		{
			if(text.charAt(i)==pattern.charAt(j))
			{
				i--;j--;
			}
			else
			{
				if(mp.containsKey(text.charAt(i)))
				{
					i=i+mp.get(text.charAt(i))+pl-1-j;
					j=pl-1;
				}
				else
				{
					i=i+pl+pl-1-j;
					j=pl-1;
				}
				
			}
		}
		if(j==-1)
		{
			System.out.println("found");
		}
	}
}
