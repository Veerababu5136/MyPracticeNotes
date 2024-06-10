package com.dsa2;

public class SumOfFractions {

	public static void main(String[] args) 
	{
		int f1[]= {1,4};
		
		int f2[]= {3,3};
		
		int x1=f1[0],x2=f2[0],y1=f1[1],y2=f2[1],div=1;
		
		int n1=(x1*y2)+(x2*y1);
		int d1=(y1*y2);
		
		System.out.println(n1+"/"+d1);
		
		if(n1<d1)
		{
			div=n1;
		}
		else
		{
			div=d1;
		}
		
		for(;div>0;div--)
		{
			if(n1%div==0 && d1%div==0)
			{
			n1/=div;
			d1/=div;
			}
		}
		
		System.out.println("fraction ="+n1+"/"+d1);
		// TODO Auto-generated method stub

	}

}
