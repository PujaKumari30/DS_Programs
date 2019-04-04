/*
 * Program to find whether 2 unordered arrays are same or not
 */
package com.program.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class TwoArrayAreSame {
	
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int a1[] = new int[n1];
		int a2[] = new int[n2];
		for(int i =0;i < n1;i++)
			a1[i] = sc.nextInt();
		for(int i =0;i < n2;i++)
			a2[i] = sc.nextInt();
		
		int flag =0;
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i : a1)
		{
			if(hm.containsKey(i))
				hm.put(i,hm.get(i)+1);
			else
				hm.put(i,1);
		}
		
		for(int i : a2)
		{
			if(hm.containsKey(i))
				hm.put(i, hm.get(i)-1);
			else
			{
				flag =1;
				break;
			}
		}
		
		if(flag == 0)
		{
			for(int i : hm.values())
			{
				if (i!=0)
				{
					flag =1;
					break;
				}
			}
		}
		
		if(flag == 1)
			System.out.println("2 Arrays are not same");
		else
			System.out.println("2 Arrays are same");
		sc.close();
	}

}
