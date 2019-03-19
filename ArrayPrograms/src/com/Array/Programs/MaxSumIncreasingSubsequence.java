/*
Input -
2
7
1 101 2 3 100 4 5

Output -
106
 All the increasing subsequences are : (1,101); (1,2,3,100); (1,2,3,4,5). Out of these (1, 2, 3, 100) has maximum sum,i.e., 106.
 */

package com.Array.Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSumIncreasingSubsequence {
	
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
			
			int sum[] = new int[n];
			for(int i = 0;i<n;i++)
			{
				sum[i] = a[i];
			}
			for(int i=1;i<n;i++)
			{
				for(int j=0;j<i;j++)
				{
					if(a[j] < a[i] && sum[j] + a[i] > sum[i])
						sum[i] = sum[j] + a[i];
				}
			}
			
			int max=0;
			
			for(int i =0;i<n;i++)
			{
				if(max < sum[i])
					max = sum[i];
			}
			
			System.out.println(max);
		}
	
	}
}
