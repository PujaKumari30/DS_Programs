package com.linkedlist.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseList {
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
			
			Node newHead = Reverse(head);
			while(newHead!=null)
			{
				System.out.print(newHead.data + " ");
				newHead=newHead.next;
			}
		}
	}
	
	public static Node Reverse(Node head)
	{
		Node current = head;
		Node prev = null;
		while(current!=null)
		{
			head=current.next;
			current.next=prev;
			prev=current;
			current = head;
		}
		
		return prev;	
	}

}
