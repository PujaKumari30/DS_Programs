package com.prog.sorting;

import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		

		for(int i =1;i<n;i++)
		{			
				for(int j =i-1;j>=0;j--) 	// Method 1
					{
					
						if(a[j+1] < a[j])
						{
							int temp = a[j];
							a[j]  = a[j+1];
							a[j+1] = temp;
						}
					}
			
		/*	int key = a[i],j=0;		// Method 2
			
			for(j =i-1;j>=0 && key < a[j] ;j--)
			{
				a[j+1] = a[j];
			}
			
			a[j+1] = key;	*/		
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
