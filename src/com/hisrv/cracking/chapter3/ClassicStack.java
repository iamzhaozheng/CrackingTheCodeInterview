package com.hisrv.cracking.chapter3;

import java.util.Stack;

public class ClassicStack implements IStack<Integer> {

	private Stack<Integer> mStack = new Stack<Integer>();
	
	@Override
	public void push(Integer v) {
		// TODO Auto-generated method stub
		mStack.push(v);
	}

	@Override
	public Integer pop() {
		// TODO Auto-generated method stub
		return mStack.pop();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return mStack.isEmpty();
	}

	@Override
	public Integer peek() {
		// TODO Auto-generated method stub
		return mStack.peek();
	}
	
}
