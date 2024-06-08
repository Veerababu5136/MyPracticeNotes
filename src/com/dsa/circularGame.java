package com.dsa;

public class circularGame 
{
	 public static int findTheWinner(int n, int k)
	    {
	        int ans=solve(n,k)+1;
	        return ans;
	    }
	    
	    public static int solve(int n,int k)
	    {
	       if(n==1)
	       {

	        return 0;
	       }
	        
	        return (solve(n-1,k)+k)%n;
	    }
	    
	    public static void main(String[] args)
	    {
	    	System.out.println(findTheWinner(5,2));
	    }
}
