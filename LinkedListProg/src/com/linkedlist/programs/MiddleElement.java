package com.linkedlist.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiddleElement {
	
	public static void main(String args[]) throws IOException
	{
		int T,n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		while(T-- > 0)
		{
			n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String str1[] = str.split(" ");
			int a[] = new int[n];
			a[0] = Integer.parseInt(str1[0]);
			Node head = new Node(a[0]);
			Node temp = head;
			for(int i = 1;i < n;i++)
			{
				a[i] = Integer.parseInt(str1[i]);
				temp.next = new Node(a[i]);
				temp = temp.next;
			}
			
			System.out.println(MiddleElement.getMiddle(head));
		}
	}
	
	public static int getMiddle(Node head)
	{ 
		Node temp = head;
        while(temp!=null && temp.next!=null)
        {
            temp = temp.next.next;
            head = head.next;
        }
        
		return(head.data);
	}

}
