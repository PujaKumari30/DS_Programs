/*
 * Program to find start node of the loop in linked list if list has loop
 */
package com.linkedlist.programs;

public class StartLoopNode {
	
	public Node startNodeOfLoop(Node head)
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
			
			return slowPtr;
		}
		
		return null;	
	}

}
