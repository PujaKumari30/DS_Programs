/* Program to find nth node from the end of the linked list
 */
package com.linkedlist.programs;

public class NthNodeFromEnd {
	public Node nNodeFromEnd(Node head,int n)
	{
		Node nNode = head;
		Node temp = head;
		int count =0;
		while(temp!=null)
		{
			if(count > n)
				nNode = nNode.next;
			temp = temp.next;
			count++;
				
		}
		
		if(count >= n)
		return nNode;
		
		return null;
		
	}	
}
