package com.dsa.substrings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubsStringWithoutRepeatingCharcaters {

	public static void main(String[] args) 
	{
	
		String str="abcaddabc";
		int left=0,right=0,maxLength=0;
		
		Set<Character> set=new HashSet();
		
		for(right=0;right<str.length();right++)
		{
			char c=str.charAt(right);
			
			while(set.contains(c))
			{
				set.remove(str.charAt(left));
				left+=1;
			}
			
			set.add(c);
			
			maxLength=Math.max(maxLength,right-left+1);
			
		}
		
		System.out.println(maxLength);

	}

}
