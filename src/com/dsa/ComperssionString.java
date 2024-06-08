package com.dsa;
import java.util.*;
/*
 * Write a function that takes input and output as shown under:
 * Input (string) Output (string)
 * aaa              a3
 * aabbcc           a2b2c2
 * aaabcdd          a3b1c1d2
 * a                a1
 * aabbaaa          a2b2a3
 * 
 * 
 * logic  
 * 1.iterate to 1 to n
 * 2.if s[1]==s[0] means i==i-1 char in s then inc+1 c
 * 3.when not equal then append s[i-1]+char of c to new string
 * 4.but final char in string left so append its char,count to new string
 */

public class ComperssionString {

    public static void main(String[] args) 
    {
    	String str,compressedString="";
    	
    	int c=1;
    	
    	Scanner scanner=new Scanner(System.in);
    	
		System.out.println("Enter a string");

    	str=scanner.next();
    	
    	
    	for(int i=1;i<str.length();i++)
    	{
    		if(str.charAt(i)==str.charAt(i-1))
    		{
    			c+=1;
    			
    		}
    		else
    		{
    			compressedString += str.charAt(i - 1);

                compressedString += (char) (c + '0'); // Convert count to character and append
     			c=1;
     			}
    		
    	}
    	compressedString+=str.charAt(str.length()-1);
        compressedString += (char) (c + '0'); // Convert count to character and append
    	
    	System.out.println(compressedString);
    }
    
    

}