package com.dsa2;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating 
{

	public static void main(String[] args) 
	{
		String str="aaabbbcde";
		
		int c=0;
		
		Map<Character,Integer> mp=new HashMap();
		
		
		for(int i=0;i<str.length();i++)
		{
			if(mp.containsKey(str.charAt(i)))
			{
				mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
				continue;
			}
			mp.put(str.charAt(i),1);
		}
		
		System.out.println(mp);
		
		for(int i=0;i<str.length();i++)
		{
			if(mp.get(str.charAt(i))==1)
			{
				System.out.println(str.charAt(i));
				c+=1;
				break;
			}
		}
		
		if(c==0)
		{
			System.out.println(0);
		}
		// TODO Auto-generated method stub

	}

}
