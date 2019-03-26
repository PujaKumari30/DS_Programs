package com.programs.stack;

import java.util.Arrays;

public class DynamicArrayStack {
	int top;
	int capacity;
	int array[];
	
	DynamicArrayStack()
	{
		top = -1;
		capacity = 1;
		array = new int[capacity];
	}
	
	void doubleStack(DynamicArrayStack stack)
	{
		stack.capacity *= 2;
		stack.array = Arrays.copyOf(stack.array,stack.capacity);
	}
	
	Boolean isEmptyStack(DynamicArrayStack stack)
	{
		return (stack.top == -1);		
	}
	
	Boolean isFullStack(DynamicArrayStack stack)
	{
		return (stack.top == stack.capacity -1);
	}
	
	void push(DynamicArrayStack stack,int data)
	{
		if(isFullStack(stack))
			System.out.println("Stack full");
		else
		{
			stack.array[++stack.top] = data;
		}	
	}
	
	int pop(DynamicArrayStack stack)
	{
		if(isEmptyStack(stack))
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		else
			return stack.array[stack.top--];
	}
	
	int peek(DynamicArrayStack stack)
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
