package com.prog.sorting;

import java.util.Scanner;

public class MergeSort {

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
			int mid = (l+h)/2;
			Sort(a,l,mid);
			Sort(a,mid+1,h);
			Merge(a,l,mid,h);
		}
		
	}
	
	static void Merge(int a[],int l,int mid,int h)
	{
		int m1 = mid - l +1;
		int m2 = h - mid;
		int L[] = new int[m1];
		int H[] = new int[m2];
		
		for(int i = 0;i<m1;i++)
		{
			L[i] = a[l+i];
		}
		
		for(int i = 0;i<m2;i++)
		{
			H[i] = a[mid+1+i];
		}
		
		int k=l,i=0,j=0;
		
		while(i < m1 && j < m2)
		{
			if(L[i] <= H[j])
			{
				a[k] = L[i];
				i++;
			}
			
			else
			{
				a[k] = H[j];
				j++;
			}
			
			k++;
			
		}
		
		while(i < m1)
		{
			a[k] = L[i];
			i++;
			k++;
		}
		
		while(j < m2)
		{
			a[k] = H[j];
			j++;
			k++;
		}
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
