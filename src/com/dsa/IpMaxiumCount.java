package com.dsa;

import java.util.*;

public class IpMaxiumCount 
{
	public static void main(String[] args)
	{
		String[] str={"10.0.0.1 satish","10.0.0.2 Vinay","10.0.0.1 Deepa"};
		 
		Map<String,Integer> frequencyMap=new HashMap();
		
		String res="";
		
		int max=0;
		
		for(String ip : str)
		{
		
			String[] c=ip.split(" ");
		 
			if(frequencyMap.containsKey(c[0]))
			{
				int value=frequencyMap.get(c[0]);
				
				frequencyMap.put(c[0],value+1);
			}
			else
			{
			frequencyMap.put(c[0],1);
			}
		}
		
		System.out.println(frequencyMap);
		
	     for(Map.Entry<String,Integer> set :
             frequencyMap.entrySet())
	     {
	    	 if(set.getValue()>max)
	    	 {
	    		 res="";
	    		 res=set.getKey();
	    	 }
	     }
		
	     System.out.println(res);
	}

}
