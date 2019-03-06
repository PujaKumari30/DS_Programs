package com.prog.sorting;

import java.util.Scanner;

public class QuickSort {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int l =0,h = a.length-1;
		Sort(a,l,h);
		printArr(a);
		
		sc.close();
	}
	
	static void Sort(int a[],int l,int h)
	{
		if(l<h)
		{
			int pivot = partition(a,l,h);
			Sort(a,l,pivot-1);
			Sort(a,pivot+1,h);
		}
		
	}
	
	static int partition(int a[],int l ,int h)
	{
		int pivot = a[h];
		int i = l-1;
		for(int j=l;j<h;j++)
		{
			if(a[j] <= pivot)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
				
		}
		
		a[h] = a[i+1] ;
		a[i+1] = pivot;
		
		return i+1;
		
	}
	
	
	static void printArr(int a[])
	{
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<a.length;i++)
		{
			sb.append(a[i] + " ");
		}
		
		System.out.println(sb);
	}

}
