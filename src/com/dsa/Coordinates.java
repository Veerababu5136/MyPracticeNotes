package com.dsa;
import java.util.*;

/*
 * A robot can move in 4 directions: up, down, left, and right. Its path is encoded in a string with characters U, D, L, and R. 
 * If the bot starts at coordinate {0,0}, then find its final coordinate based on the input path string.
 * 
 * Example 1:
 * Input: "UDRR"
 * Output: [2,0]
 * 
 * Example 2:
 * Input: "DD"
 * Output: [0,-2]
 * 
 * 
 * 
 * The LeetCode problem that is similar to this is "Robot Return to Origin", 
 * which can be found under problem number 657
 */

public class Coordinates {
    
    public static void main(String[] args) 
    {
    	
         Scanner scanner=new Scanner(System.in);
		 
		 String str;
		 
		 System.out.println("Enter a string");
		 
		 str=scanner.next();
		 
		 int[] result= {0,0};
		 
		 for(int i=0;i<str.length();i++)
		 {
			 char c=str.charAt(i);
			 
			 if(c=='U')
			 {
				 result[1]+=1;
			 }
			 
			 else if(c=='D')
			 {
				 result[1]-=1;
			 }
			 
			 else if(c=='L')
			 {
				 result[0]-=1;
			 }
			 else
			 {
				 result[0]+=1;
			 }
		 }
    
		 System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
}
