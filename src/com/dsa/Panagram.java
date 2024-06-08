package com.dsa;

import java.util.*;

public class Panagram 
{

	public static void main(String[] args) 
	{
		String str="welcome to geeksforgeeks";
	    String str2="abcdefghijklmnopqrstuvwxyz",str3="";
	    
		Set<Character> set=new HashSet();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
//		System.out.print(set);
		for(int i=0;i<str2.length();i++)
		{
		
			if (!set.contains(str2.charAt(i))) 
			{			
				str3+=str2.charAt(i);
			}
		}
		
            System.out.println(str3);
	}
	
}
