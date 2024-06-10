package com.dsa2;

public class PowerOf10 {

	public static void main(String[] args)
	{
		int n=100;
		
		while(n%10==0)
		{
			n/=10;
		}
		
		System.out.println(n==1);

	}

}
