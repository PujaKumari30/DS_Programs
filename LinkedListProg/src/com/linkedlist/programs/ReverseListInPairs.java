/*
 * Reverse Linked List Nodes in Pairs - 1->2->3->4->5 => 2->1->4->3->5
 */
package com.linkedlist.programs;

public class ReverseListInPairs {
	
	//Method -1 Recursion
	public Node ReverseLinkedListInPairs(Node head)
	{
		Node temp;
		if(head == null || head.next == null)
			return head;
		temp = head.next;
		head.next = temp.next;
		temp.next = head;
		
		return ReverseLinkedListInPairs(head.next);
		
	}
	
	//Method -2 swapping only data
	public static void pairwiseSwap(Node node)
    {
        int temp;
        Node current = node;
       while(current!=null && current.next!=null)
       {
           temp = current.data;
           current.data = current.next.data;
           current.next.data = temp;
           current = current.next.next;
       }
    }
	
	//Method -3 Iterative
	public static void pairwiseSwap(Node node)
    {
        Node current = node,prev = null,prev1=null,next=null,next1=null;
       	while(current!=null && current.next!=null)
       	{
       	    prev = current;
       	    next = current.next;
       	    next1 = current.next.next;
       	    next.next = prev;
       	    if(prev1!=null)
       	    {
       	        prev1.next=next;
       	        prev1 = prev;
       	    }
       	    else
       	    {
       	        node = next;
       	        prev1= prev;
       	    }
       	    
       	    current = next1;
       	}
    }

}
