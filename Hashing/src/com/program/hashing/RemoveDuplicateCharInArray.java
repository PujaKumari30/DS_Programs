/*
 * Given an array characters,give an algorithm for removing the duplicates
 */
package com.program.hashing;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharInArray {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char str1[] = str.toCharArray();
		//removeDuplicateUsingArray(str1);
		removeDupUsingArray(str1);
		removeDuplicateUsingHash(str);

		sc.close();
	}	

	static void removeDuplicateUsingArray(char str1[])		/*	remove duplicates without maintaining the character order*/
	{
		int n = str1.length;

		for(int i =0;i<n;i++)
		{
			for(int j=i+1;j<n;)
			{
				if(str1[i] == str1[j])
				{
					str1[j] = str1[--n];
					str1[n] = '\0';
				}
				else
					j++;	/*If last char is not same as given char then increment j */
			}
		}

		String str2 = "";

		for(int i =0;i<str1.length;i++)
			str2 += str1[i];

		System.out.println("String after removing duplicates using array : "+str2);

	}
	
	static void removeDupUsingArray(char str1[])		/*	remove duplicates with maintaining the character order*/
	{
		int index =0;
		for(int i=0;i<str1.length;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(str1[i] == str1[j])
					break;
			}
			
			if(i == j)
				str1[index++] = str1[i];
		}
	
		System.out.print("String after removing duplicates using array and maintaining char order : ");
		
		for(int i =0;i<index;i++)
			System.out.print(str1[i]);
		
		System.out.println();
	}
	static void removeDuplicateUsingHash(String str) {
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		for(int i = 0;i<str.length();i++)
		{
			if(!hs.contains(str.charAt(i)))
			hs.add(str.charAt(i));
		}
		
		System.out.print("String after removing duplicate using hash : ");
		for(Character c : hs)
		{
			System.out.print(c);
		}
	}
}
