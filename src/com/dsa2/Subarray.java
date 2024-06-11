package com.dsa2;

import java.util.HashMap;
import java.util.Map;

public class Subarray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,5};
		
		int target=10,k=0,j=0;
		
		int n=a.length;
		//printing all subarrays.....
		
		for(int i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				for(k=i;k<=j;k++)
				{
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
		}
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				sum=0;

				for(k=i;k<=j;k++)
				{
					sum=sum+a[k];
					
				}
				
				if(target==sum)
				{
				 System.out.println(i+" "+j);	
				}
			}
		}
		
		
		 Map<Integer, Integer> prefixSumMap = new HashMap();
	        int currentSum = 0;
	        
	        for (int i = 0; i < n; i++) {
	            currentSum += a[i];
	            
	            // If currentSum equals target, print the subarray from start to i
	            if (currentSum == target) {
	                System.out.println("Subarray found from index 0 to " + i);
	            }
	            
	            // If (currentSum - target) is found in the map, it means there's a subarray sum that equals the target
	            if (prefixSumMap.containsKey(currentSum - target)) {
	                System.out.println("Subarray found from index " + (prefixSumMap.get(currentSum - target) + 1) + " to " + i);
	            }
	            
	            // Add currentSum to the map
	            prefixSumMap.put(currentSum, i);
	        }
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
