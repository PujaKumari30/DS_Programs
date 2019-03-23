/*
 * Program to find whether the Linked list length is even or odd
 */
package com.linkedlist.programs;

public class EvenOrOddLengthList {
	
	public int isListLengthOdd(Node head)
	{
		while(head!=null && head.next!=null)
		{
			head = head.next.next;
		}
		
		if(head == null)
			return 0;
		return 1;
		
	}

}
