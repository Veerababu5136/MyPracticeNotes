package com.dsa2;

public class LongestePalidromicSubString {

	public static void main(String[] args) 
	{
		String str="geeksforgeek";
		
		int len=str.length();
		int left=0,right=0,maxLength=0;
		
		if(len>1)
		{
			for(int i=0;i<len;i++)
			{
				int len1=expandAroundCenter(str, i, i);
				int len2=expandAroundCenter(str, i, i+1);
				
				maxLength=Math.max(len1,len2);
				
				if(maxLength>(right-left))
				{
					left=i-(maxLength-1)/2;
					right=i+maxLength/2;
				}
				
			}
		}
		
		System.out.println(str.substring(left, right+1));

	}
	
	private static int expandAroundCenter(String s,int left,int right)
	{
		while((left>=0 && right<s.length()) && s.charAt(left)==s.charAt(right))
		{
			left--;
			right++;
		}
		
		return right-left-1;
	}

}
