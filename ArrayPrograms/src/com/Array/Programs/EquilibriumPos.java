package com.Array.Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPos {

	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			String str[] = s.split(" ");
			int a[] = new int[n];
			int flag =0,sum=0,prevSum=0,totalSum=0;
			for(int i =0;i<n;i++)
			{
				a[i] = Integer.parseInt(str[i]);
				totalSum = totalSum+a[i];
			}
			
			if(n==1)
			{
				System.out.println(1);
				
			}
			else if(n==2)
				System.out.println(-1);
			else
			{
			for(int i =0;i<n;i++)
			{
				prevSum = sum;
				sum = sum+a[i];
				if(totalSum-sum == prevSum)
				{
				    System.out.println(i+1);
				    flag =1;
				    break;
				}
			}
			
			if(flag ==0)
			System.out.println(-1);
			}
			
		}
		
	}
}
