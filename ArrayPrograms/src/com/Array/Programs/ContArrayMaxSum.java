package com.Array.Programs;

import java.util.Scanner;

public class ContArrayMaxSum {
	
	public static void main(String args[])
	{
		int t,n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0)
		{
			n = sc.nextInt();
			int a[] = new int[n];
			for(int i =0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			
			MaxSum(a,n);
		}
		
		sc.close();
	}
	
	public static void MaxSum(int a[],int n)
	{
		int maxSum=a[0],CurrentMax=a[0];
		for(int i =1;i<n;i++)
		{
		    CurrentMax=Math.max(a[i],CurrentMax+a[i]);
			maxSum=Math.max(maxSum, CurrentMax);
		}
		
		System.out.println(maxSum);
	}
}
