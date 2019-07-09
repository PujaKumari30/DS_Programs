package com.programs.stack;

public class ListStack {
	int data;
	ListStack next;
	
	ListStack(int data)
	{
		this.data = data;
		next = null;
	}
	
	Boolean isEmptyStack(ListStack top)
	{
		return (top == null);		
	}
	
	void push(ListStack top,int data)
	{
		ListStack temp = new ListStack(data);
		temp.next = top;
		top = temp;
	}
	
	int pop(ListStack top)
	{
		if(isEmptyStack(top))
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		else
		{
			return top.data;
			top = top.next;	
		}
	}
	
	int peek(ListStack top)
	{
		if(isEmptyStack(top))
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		
		else
			return(top.data);
	}
}
