package com.dsa2;

public class Robot {

	public static void main(String[] args) 
	{
		String str="UDRR";
		
		int l=0,r=0;
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(c=='U')
			{
				r+=1;
			}
			else if(c=='D')
			{
				r-=1;
			}
			else if(c=='L')
			{
				l-=1;
			}
			else
			{
				l+=1;
			}
		}
		
System.out.println(l+" "+r);
	}

}
