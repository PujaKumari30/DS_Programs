package com.programs.stack;

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

}
