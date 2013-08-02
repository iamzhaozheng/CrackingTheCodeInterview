package com.hisrv.cracking.chapter3;

import com.hisrv.cracking.chapter2.ILinkedList;

public class Problem5 {
	public static class LinkedListByTwoStacks implements ILinkedList {
		private IStack<Integer> mAddStack = new ClassicStack();
		private IStack<Integer> mRemoveStack = new ClassicStack();
		
		@Override
		public void add(int v) {
			// TODO Auto-generated method stub
			mAddStack.push(v);
		}

		@Override
		public int remove() {
			// TODO Auto-generated method stub
			if (mRemoveStack.isEmpty()) {
				while (!mAddStack.isEmpty()) {
					mRemoveStack.push(mAddStack.pop());
				}
			}
			if (mRemoveStack.isEmpty()) {
				return -1;
			}
			return mRemoveStack.pop();
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return mRemoveStack.isEmpty() && mAddStack.isEmpty();
		}
		
	}
}
