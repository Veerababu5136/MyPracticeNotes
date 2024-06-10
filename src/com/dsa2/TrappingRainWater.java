package com.dsa2;

import java.util.Arrays;

public class TrappingRainWater {

	public static void main(String[] args) 
	{
		
		int a[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int leftMax[]=new int[a.length];
		
		int rightMax[]=new int[a.length];
		
		int waterTrapped=0;
		
		leftMax[0]=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			leftMax[i]=Math.max(a[i],leftMax[i-1]);
		}

        System.out.println(Arrays.toString(leftMax));
        
        rightMax[a.length-1]=a[a.length-1];
        
        for(int i=a.length-2;i>=0;i--)
        {
        	rightMax[i]=Math.max(a[i],rightMax[i+1]);
        }
        
        System.out.println(Arrays.toString(rightMax));
        
        for(int i=0;i<a.length;i++)
        {
        	int min=Math.min(leftMax[i],rightMax[i]);
        	
        	waterTrapped=waterTrapped+(min-a[i]);
        }
        
        System.out.println(waterTrapped);
        
	}

}
