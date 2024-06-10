package com.dsa2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ip {

	public static void main(String[] args) 
	{
		String[] str={ "10.0.0.1 satish","10.0.0.2 Vinay","10.0.0.1 Deepa"};
		
		Map<String,Integer> mp=new HashMap();
		

		for(int i=0;i<str.length;i++)
		{
			String ip=str[i];
			
			String ipaddress=ip.split(" ")[0];
			
	//System.out.println(ipaddress);
			
			if(mp.containsKey(ipaddress))
			{
				int value=mp.get(ipaddress);
				mp.put(ipaddress,value+1);
				
			}
			else
			{
				mp.put(ipaddress,1);
			}
		}
		
		System.out.println(mp);
		for(Map.Entry<String,Integer> set : mp.entrySet())
		{
			if(set.getValue()==1)
			{
				System.out.println(set.getKey());
			}
		}

		// TODO Auto-generated method stub

	}

}
