/*
 * Program to find length of the loop of the linked list
 */
package com.linkedlist.programs;

public class LoopLength {
	public static int countLoopLength(Node head)
	{
		Node slowPtr = head;
		Node fastPtr = head;
		int loopExists = 0;
		int count =0;
		while(fastPtr!=null && fastPtr.next!=null)
		{
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(fastPtr == slowPtr)
			{	loopExists = 1;
				break;
			}
		}
		

		if(loopExists == 1)
		{	
			while(slowPtr!= fastPtr.next)
			{	
				fastPtr = fastPtr.next;
				count++;
			}
			return count;
		}
		
		return 0;	
	}
	
	public static void main(String args[])
	{
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = head.next.next;
		
		System.out.println(countLoopLength(head));
	}

}
