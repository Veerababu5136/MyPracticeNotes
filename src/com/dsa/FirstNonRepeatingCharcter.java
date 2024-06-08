package com.dsa;
import java.util.*;

public class FirstNonRepeatingCharcter {

	public static void main(String[] args) 
	{
		 Scanner scanner=new Scanner(System.in);
		 
		 String str;
		 int c=0;
		 
		 System.out.println("Enter a string");
		 
		 str=scanner.next();
		 
		 Map<Character,Integer> hashMap=new HashMap<>();
		 
		 for(int i=0;i<str.length();i++)
		 {
			 if(hashMap.containsKey(str.charAt(i)))
			 {
				 int value=hashMap.get(str.charAt(i));
				 
				 hashMap.put(str.charAt(i), value+1);
			 }
			 else
			 {
			 hashMap.put(str.charAt(i),1);
			 }
			 
		 }
		 System.out.println(hashMap); //testing
		 
		 for(int i=0;i<str.length();i++)
		 {
			 if(hashMap.get(str.charAt(i))==1)
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
	}

}
