package com.string.prog;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String strRev = "";
		for(int i = str.length()-1;i>=0;i--)
		{
			strRev +=  str.charAt(i);
		}
		
		sc.close();
		
		System.out.println("Reverse of given String "+str+" is : "+strRev);
	}

}
