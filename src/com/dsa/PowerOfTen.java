package com.dsa;
import java.util.*;

public class PowerOfTen 
{
	public static void main(String[] args)
	{
		Long num;
		
		 Scanner scanner=new Scanner(System.in);
           
		 System.out.println("enter a number:");
		 
		 num=scanner.nextLong();
		 
		 while(num%10==0)
		 {
			 num/=10;
		 }
		 
		 System.out.println(num==1);
	}

}
