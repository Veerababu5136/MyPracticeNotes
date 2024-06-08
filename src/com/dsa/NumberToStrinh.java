package com.dsa;

import java.util.HashMap;
import java.util.Map;

public class NumberToStrinh 
{
	public static void main(String[] args)
	{
		int n=5,d=2;
		 long x = Math.abs(n*1L), y = Math.abs(d*1L);
	        StringBuilder sb = new StringBuilder();
	        if (n < 0 && d > 0 || n > 0 && d < 0){
	            sb.append('-'); // append '-' if one of n or d is negative.
	        }

	        Map<Long, Integer> map = new HashMap<>();
	        sb.append(x / y);
	        x %= y;
	        if (x > 0){ // only append '.' when we have reminder.
	            sb.append('.');
	        }
	        while(!map.containsKey(x)){ // keep doing division until we find a cycle
	            map.put(x, map.size());
	            x *= 10;
	            if (x > 0){
	                sb.append(x / y);
	            }
	            x %= y;
	        }

	        if (x > 0){ // only append '()' when there is a cycle.
	            sb.insert(sb.length() - (map.size() - map.get(x)), '(');
	            sb.append(')');
	        }
	       System.out.println(sb.toString());
	    
}

}
