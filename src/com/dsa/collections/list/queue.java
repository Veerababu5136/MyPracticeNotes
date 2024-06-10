package com.dsa.collections.list;

import java.util.*;

public class queue {
	
	public static void main(String[] args)
	{
		Queue<Integer> qp=new PriorityQueue<>();
		
		qp.add(3);
		qp.add(1);
		
		System.out.println(qp);
	}

}
