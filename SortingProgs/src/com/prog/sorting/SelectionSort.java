package com.prog.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String str[] = s.split(" ");
		int a[]  = new int[n];
		for(int i = 0;i<n;i++)
		{
			a[i] = Integer.parseInt(str[i]);
		}
		
		for(int i =0;i< n ;i++)
		{
			int minPos = i;
			
			for(int j = i+1;j<n;j++)
			{
				if(a[j]< a[minPos])
				{
					minPos = j;	
				}
					
			}
			
			if(minPos != i)
			{
			
				int temp = a[i];
				a[i] = a[minPos];
				a[minPos] = temp;
			}
		
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<n;i++)
		{
			sb.append(a[i] + " ");
		}
		
		System.out.println(sb);
	}

}
