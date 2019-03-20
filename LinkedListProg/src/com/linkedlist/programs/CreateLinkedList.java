package com.linkedlist.programs;



public class CreateLinkedList {
	public static void main(String args[])
	{
		CreateLinkedList ll = new CreateLinkedList();
		Node node1 = new Node(1); /* Adding 1st Node */
		Node node2 = new Node(2); /* Adding 2nd Node */
		Node node3 = new Node(3); /* Adding 3rd Node */
		Node node4 = new Node(4); /* Adding 4th Node */
		Node node5 = new Node(5); /* Adding 5th Node */
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		
		ll.traverseList(node1);
		
	}
	
	/* Traversing Linked list and counting no of nodes */
	
	public void traverseList(Node head)
	{
		int count =0;
		System.out.print("Linked List - ");
		while(head!= null)
		{
			System.out.print(head.data + " ");
			head = head.next;
			count++;
		}
		
		System.out.println("\nTotal no of nodes in Linked List - "+ count);
	}
	
}


  

