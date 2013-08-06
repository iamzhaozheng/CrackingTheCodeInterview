package com.hisrv.cracking.chapter3;

import java.util.Stack;

public class Problem6 {
	private Stack<Integer> mStack = new Stack<Integer>();
	private Stack<Integer> mTempStack = new Stack<Integer>();

	private void sortPush(int v) {
		while (!mStack.isEmpty() && mStack.peek() < v) {
			mTempStack.push(mStack.pop());
		}
		mStack.push(v);
		while (!mTempStack.isEmpty()) {
			mStack.push(mTempStack.pop());
		}
	}

	public static void main(String[] args) {
		Problem6 f = new Problem6();
		f.sortPush(6);
		f.sortPush(1);
		f.sortPush(4);
		f.sortPush(8);
		f.sortPush(3);
		f.sortPush(2);
		f.sortPush(7);
		f.sortPush(5);
		while (!f.mStack.isEmpty()) {
			System.out.print(f.mStack.pop() + " ");
		}
	}
}
