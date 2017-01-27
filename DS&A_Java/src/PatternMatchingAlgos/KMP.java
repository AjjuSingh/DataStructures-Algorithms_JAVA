package PatternMatchingAlgos;

public class KMP {

	String text;
	String pattern;
	
	public KMP(String t,String p)
	{
		this.text=t;
		this.pattern=p;
	}
	
	public void KMP()
	{
		int t=text.length();
		int p=pattern.length();
		int pt[]=new int[p];
		prefixTable(pt);
		System.out.println("The prefix table is :");
		for(int i=0;i<pt.length;i++)
			System.out.print(pt[i]+" ");
		int i=0;
		while(i<p)
		{
			if(pattern.charAt(i)==text.charAt(i))
			{
				
			}
		}
		
		
	}
	
	private void prefixTable(int pt[])
	{
		int i=1,j=0;
		pt[0]=0;
		while(i<pt.length)
		{
			if(pattern.charAt(i)==pattern.charAt(j))
			{
				pt[i]=j+1;
				i++;
				j++;
				
			}
			else if(j!=0)
			{
				j=pt[j-1];
			}
			else
			{
				pt[i]=0;
				i++;
			}
		}
		
	}
	
	
}
