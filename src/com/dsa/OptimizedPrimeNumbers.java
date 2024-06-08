package com.dsa;
import java.util.*;

public class OptimizedPrimeNumbers {

	public static void main(String[] args) 
	{
		int num,c=0;
		
        Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter a number:\n");
		
		num=scanner.nextInt();
		
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				System.out.println("not prime");
			    c+=1;
			    break;
			}
		}
	   if(c==0)
		{
		System.out.println("prime");
		}
	
	}

}
