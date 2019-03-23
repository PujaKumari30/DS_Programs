/*
 * Program to print node from the end of the list
 */
package com.linkedlist.programs;

public class DisplayListFromEnd {
	public void PrintListFromEnd(Node head)
	{
		if(head == null)
			return;
		PrintListFromEnd(head.next);
		System.out.println(head.data);
	}

}
