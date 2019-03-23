/* Program to find nth node from the end of the linked list
 */
package com.linkedlist.programs;

public class NthNodeFromEnd {
	public static int nNodeFromEnd(Node head,int n)
	{
		Node nNode = head;
		Node temp = head;
		int count =0;
		while(temp!=null)
		{
			temp = temp.next;
			count++;
			if(count > n)
				nNode = nNode.next;			
		}
		
		if(count >= n)
		return nNode.data;
		
		return -1;
	}	
	
	public static void main(String args[])
	{
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		System.out.println(nNodeFromEnd(head,2));
	}
}
