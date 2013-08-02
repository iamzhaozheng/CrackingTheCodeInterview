package com.hisrv.cracking.chapter3;

import java.util.Stack;

public class Problem2 {
	public static class StackMinNode {
		public int val;
		public int min;
		
		public StackMinNode(int val, int min) {
			this.val = val;
			this.min = min;
		}
	}
	
	public static class StackWithMin implements IStack<Integer> {
		
		private Stack<StackMinNode> mStack = new Stack<StackMinNode> ();
		
		@Override
		public void push(Integer v) {
			// TODO Auto-generated method stub
			if (mStack.isEmpty()) {
				mStack.push(new StackMinNode(v, v));
			} else {
				mStack.push(new StackMinNode(v, Math.min(mStack.peek().min, v)));
			}
		}

		@Override
		public Integer pop() {
			// TODO Auto-generated method stub
			return mStack.pop().val;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return mStack.isEmpty();
		}

		@Override
		public Integer peek() {
			// TODO Auto-generated method stub
			return mStack.peek().val;
		}
		
		public Integer min() {
			return mStack.peek().min;
		}
		
	}
}
