/* Program to reverse string with underscore position remains the same in reverse string i.e A_BCD_EF -> E_FDC_BA */
package com.string.prog;

import java.util.Scanner;

public class StringReverse1 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String strRev = "";
		int k = str.length() - 1;
		for(int i =0;i<str.length();i++)
		{
			if(str.charAt(i) == '_')
			{
				strRev += "_";
			}
			
			if(str.charAt(k) == '_')
			{
				k--;
				continue;
			}
			
			strRev += str.charAt(k);
			k--;
		}
		
		System.out.println("Reverse String is : "+ strRev);
		
		
		sc.close();
	}
}
