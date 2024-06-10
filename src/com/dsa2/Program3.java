package com.dsa2;

public class Program3 {

	public static void main(String[] args)
	{
		String str="aaabba";
		
		String str2="";
		
		int c=0,i;
		
		for(i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				c+=1;
			}
			else
			{
				str2=str2+str.charAt(i-1)+(char)('0'+c);
				c=0;
			}
		}
		
		str2=str2+str.charAt(i-1)+(char)('0'+1);
		
		System.out.println(str2);

	}

}
