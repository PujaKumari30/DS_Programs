/*
Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.
*/

package com.Array.Programs;

import java.io.*;

public class SortArray012 {
	
	public static void main(String args[]) throws IOException
	{
		int t,n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t= Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String st[] = str.split(" ");
			int a[] = new int[n];
			int c0=0,c1=0,c2=0;
			for(int i=0;i<n;i++)
			{
				a[i] = Integer.parseInt(st[i]);
				if(a[i]==0)
				c0++;
			    else if(a[i]==1)
				c1++;
			    else if (a[i]==2)
				c2++;
			}
			
			StringBuffer sb = new StringBuffer();
			for(int i =0;i<c0;i++)
		    {
			    sb.append("0"+" ");
	    	}
		
			for(int i =0;i<c1;i++)
			{
				sb.append("1"+" ");
			}
		
			for(int i =0;i<c2;i++)
			{
				sb.append("2"+" ");
			}
			
			System.out.println(sb);
		}
	}
	
}

