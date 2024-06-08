package com.dsa;

import java.util.*;

public class PrimeNumbers 
{
	public static void main(String[] args)
	{
		int num,c=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter a number:\n");
		
		num=scanner.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				c+=1;
			}
		}
		
		if(c==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
	}

}
