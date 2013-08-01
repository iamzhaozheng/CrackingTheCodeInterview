package com.hisrv.cracking.chapter3;

import java.util.Stack;

public class ClassicStack implements IStack {

	private Stack<Integer> mStack = new Stack<Integer>();
	
	@Override
	public void push(int v) {
		// TODO Auto-generated method stub
		mStack.push(v);
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return mStack.pop();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return mStack.isEmpty();
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		return mStack.peek();
	}
	
}
