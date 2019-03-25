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

}
