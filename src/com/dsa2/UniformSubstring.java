package com.dsa2;

import java.util.HashSet;
import java.util.Set;

public class UniformSubstring {

	public static void main(String[] args)
	{
		String str="aaabbcccc";
		
        char ch = '\0'; // Initialize ch to an empty character
		
		int r=1;
		
		int maxLength=0;
		
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				r+=1;
			}
			else
			{
				if(r>maxLength)
				{
					maxLength=r;
					ch=str.charAt(i-1);
				}
				r=1;
			}
		}
		
		if (r > maxLength) {
            maxLength = r;
            ch = str.charAt(str.length() - 1);
        }
		for(;r>0;r--)
		{
			System.out.print(ch);
		}
	}

}
