package com.java.ds;

public class StackDS {

	private int size;
	private int[] stack;
	private int maxSize;

	public StackDS(int size) {
		stack  = new int[size];
		maxSize = size;
		this.size = -1;
	}

	public boolean push(int input) {
		// TODO Auto-generated method stub
		if(size < maxSize-1) {
			size++;
			stack[size] = input;
			return true;
		}
		return false;
	}
	
	public int getSize() {
		return size+1;
	}

	

	public int peek() throws IndexOutOfBoundsException {
		if(size ==-1) {
			throw new IndexOutOfBoundsException("Stack Empty");
		}
		return stack[size];
	}

	public int pop() {
		if(size <0)
			throw new IndexOutOfBoundsException("Stack Empty");
		return stack[size--];
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size >=0)
			return false;
		return true;
	}

}
