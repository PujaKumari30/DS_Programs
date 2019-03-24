/*
 * Program to merge 2 sorted list in a 3rd list in sorted order
 */
package com.linkedlist.programs;

public class MergeSortedList {
	public Node MergeList(Node head1,Node head2) {
		if(head2 == null)
			return head1;
		if(head1 == null)
			return head2;
		
		Node head3 = null;
			if(head1.data <= head2.data)
			{
				head3 = head1;
				head3.next = MergeList(head1.next,head2);
			}
			
			else
			{
				head3 = head2;
				head3.next = MergeList(head1,head2.next);
			}
		
		return head3;	
	}
}
