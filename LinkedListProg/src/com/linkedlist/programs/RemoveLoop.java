/*
 * Program to remove loop in a linked list
 */
package com.linkedlist.programs;

public class RemoveLoop {
	public static int loopRemove(Node head)
	{
		Node slowPtr = head;
		Node fastPtr = head;
		int loopExists = 0;
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
			slowPtr = head;
			while(slowPtr != fastPtr)
			{
				fastPtr = fastPtr.next;
				slowPtr = slowPtr.next;
			}
			
			while(fastPtr.next != slowPtr)
			{
				fastPtr = fastPtr.next;
			}
			fastPtr.next = null;
			return 1;
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
		
		System.out.println(loopRemove(head));
	}
}

