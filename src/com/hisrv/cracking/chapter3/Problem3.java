package com.hisrv.cracking.chapter3;

import java.util.ArrayList;

public class Problem3 {
	public class SetOfStacks implements IStack<Integer> {

		private static final int MAX = 10;
		private ArrayList<Integer[]> mStackList = new ArrayList<Integer[]> ();
		private int mSize = 0;
		
		@Override
		public void push(Integer v) {
			// TODO Auto-generated method stub
			if (mSize % MAX == 0) {
				mStackList.add(new Integer[MAX]);
			}
			mStackList.get(mSize / MAX)[mSize % MAX] = v;
			mSize ++;
		}

		@Override
		public Integer pop() {
			// TODO Auto-generated method stub
			if (mSize == 0) {
				return -1;
			}
			mSize --;
			int v = mStackList.get(mSize / MAX)[mSize % MAX];
			if (mSize % MAX == 0) {
				mStackList.remove(mSize / MAX);
			}
			return v;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return mSize == 0;
		}

		@Override
		public Integer peek() {
			// TODO Auto-generated method stub
			if (mSize == 0) {
				return -1;
			}
			int pos = mSize - 1;
			return mStackList.get(pos / MAX)[pos % MAX];
		}
		
	}
}
