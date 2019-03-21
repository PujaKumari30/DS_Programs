/* Program to detect loop in Linked List */
package com.linkedlist.programs;

public class LoopDetect {
	int detectLoop(Node head)
	  {
	   Node fastPtr = head;
	   Node slowPtr = head;
	   while(fastPtr!=null && fastPtr.next!=null)
	   {
	       fastPtr = fastPtr.next.next;
	       slowPtr = slowPtr.next;
	       if(fastPtr == slowPtr)
	       return 1;
	   }
	   
	   return 0;
	    }
}
