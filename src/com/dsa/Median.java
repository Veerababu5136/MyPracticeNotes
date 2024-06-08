package com.dsa;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) 
	{
		int[] a= {1,3};
		int[] b= {2};
		int[] c=new int[a.length+b.length];
		int k=0;
		
		int m=a.length,n=b.length,i=0,j=0;
		
		Arrays.sort(a);
//		
//		while(i<m && j<n)
//		{
//			if(a[i]<b[j])
//			{
//				c[k]=a[i];
//				i++;
//				k++;
//				
//			}
//			if(a[i]>b[j])
//			{
//				c[k]=b[j];
//				j++;
//				k++;
//			}
//		}
//		
//		while(i<m)
//		{
//			c[k]=a[i];
//			i++;
//			k++;
//			
//		}
//		
//		while(j<n)
//		{
//			c[k]=b[j];
//			j++;
//			k++;
//			
//		}
//		
		for(int ii=0;ii<c.length;ii++)
		{
		System.out.println(c[ii]+" ");
	}
	
		
		

	}

}
