/*
 * Program to add a node in sorted linked list
 */
package com.linkedlist.programs;

public class InserNodeInSortedList {
	
	public Node insertNode(Node head,Node newNode)
	{
		Node current = head,temp=null;
		if(head == null)
			return newNode;
		if(newNode.data <= current.data)
		{
			newNode.next = current;
			return newNode;
		}
		else
		{
			while(current!=null && current.data <= newNode.data)
			{
				temp = current;
				current = current.next;
			}
			
			newNode.next = current;
			temp.next = newNode;
			return head;
			
		}
		
	}
}
	
