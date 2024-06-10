package com.dsa2;

import java.util.PriorityQueue;

public class SecondMinimum {

	public static void main(String[] args) 
	{
		int[] a= {11,23,23,3,12,13,1,22};
		
		PriorityQueue<Integer> pq=new PriorityQueue();
		
		
		for(int i=0;i<a.length;i++)
		{
			pq.offer(a[i]);
		}
		
		pq.remove();
		
		System.out.println(pq.remove());
		// TODO Auto-generated method stub

	}

}
