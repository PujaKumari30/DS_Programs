/*
 * Reverse Linked List Nodes in Pairs - 1->2->3->4->5 => 2->1->4->3->5
 */
package com.linkedlist.programs;

public class ReverseListInPairs {
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

}
