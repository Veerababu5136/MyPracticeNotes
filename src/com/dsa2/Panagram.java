package com.dsa2;

import java.util.HashSet;
import java.util.Set;

public class Panagram {

	public static void main(String[] args) 
	{
		String str="welcome To Demy";
		
		String str2="abcdefghijklmnopqrstuvwxyz";
		
		String str3="";
		
		Set<Character> set=new HashSet();
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		if(set.size()==26)
		{
			System.out.println("panagram");
		}
		else
		{
			
			System.out.println("not");
		}
		
		for(int i=0;i<str2.length();i++)
		{
			if(!(set.contains(str2.charAt(i))))
			{
				str3+=str2.charAt(i);
			}
		}
		
		System.out.println(str3);
	}

}
