/*
 * To implement Stack using Array
 */
package com.programs.stack;

public class ArrayStack {
	int top;
	int capacity;
	int array[];
	
	ArrayStack(int capacity)
	{
		top = -1;
		this.capacity = capacity;
		array = new int[capacity];
	}
	
	Boolean isEmptyStack(ArrayStack stack)
	{
		return (stack.top == -1);		
	}
	
	Boolean isFullStack(ArrayStack stack)
	{
		return (stack.top == stack.capacity -1);
	}
	
	void push(ArrayStack stack,int data)
	{
		if(isFullStack(stack))
			System.out.println("Stack full");
		else
		{
			stack.array[++stack.top] = data;
		}	
	}
	
	int pop(ArrayStack stack)
	{
		if(isEmptyStack(stack))
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		else
		{
			return stack.array[stack.top--];
		}
	}
	
	int peek(ArrayStack stack)
	{
		if(isEmptyStack(stack))
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		
		else
			return(stack.array[stack.top]);
	}

}
