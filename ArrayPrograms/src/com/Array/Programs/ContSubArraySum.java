/*
 * Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5

Explanation : 
Testcase1: sum of elements from 2nd position to 4th position is 12
Testcase2: sum of elements from 1st position to 5th position is 15
 */
package com.Array.Programs;

import java.util.Scanner;

public class ContSubArraySum {
	
	public static void main (String args[])
	{
		ContSubArraySum ob = new ContSubArraySum();
		int t,n,sum;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0)
		{
			n = sc.nextInt();
			sum=sc.nextInt();
			int a[] = new int[n];
			for(int i =0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			
			ob.ContSubArrayWithSum(t,n,sum,a);
		}
		
		sc.close();
	}
	
	public void ContSubArrayWithSum(int t,int n,int sum,int a[])
	{
		for(int i =0;i<n;i++)
		{
			int s =0;
			for(int j=i;j<n;j++)
			{
				s = s+a[j];
				if(s == sum)
				{
					System.out.println((i+1)+" "+(j+1));
					return;
				}
				else if(s>sum)
					break;
			}
		}
		
		System.out.println("-1 -1");
			
	}
	
/*	public void ContSum(int t,int n,int sum,int a[])
	{
		int s =0,startIndex=0;
		for(int i =0;i<n;i++)
		{
			s =s+a[i];
			if(s==sum)
			{
				System.out.println((startIndex+1)+" "+(i+1));
				return;
			}
			
			else if(s> sum)
			{
				while(s>sum)
				{
					s = s- a[startIndex];
					startIndex= startIndex+1;
				}
					if(s==sum)
					{
						System.out.println((startIndex+1)+" "+(i+1));
						return;
					}	
			}
		}
		
		System.out.println("-1");	
	} */
}
