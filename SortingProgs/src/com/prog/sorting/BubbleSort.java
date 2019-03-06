package com.prog.sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j+1]<a[j])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<n;i++)
		{
			sb.append(a[i] + " ");
		}
		
		System.out.println(sb);
		
		sc.close();
		
	}

}
