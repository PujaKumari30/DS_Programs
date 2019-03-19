/*
 Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3
 */

package com.Array.Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayLeader {
	
	public static void main(String args[]) throws IOException
	{
		int T,n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		while(T-- > 0)
		{
			n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			String str = br.readLine();
			String str1[] = str.split(" ");
			for(int i=0;i<str1.length;i++)
			{
				a[i] = Integer.parseInt(str1[i]);
			}
	
			StringBuilder lead = new StringBuilder();
			lead = lead.append(a[n-1]); 
			int max = a[n-1];
			
			for(int i=n-2;i>=0;i--)
			{
				if(a[i] >= max)
				{
					max = a[i];
					lead = lead.append(a[i]);	
				}
			}
			System.out.println(lead.reverse());
		}
	}
}


