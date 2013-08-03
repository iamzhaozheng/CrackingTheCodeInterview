package com.hisrv.cracking.chapter3;

import java.util.ArrayList;
import java.util.Stack;

public class Problem4 {
	private ArrayList<Stack<Integer>> mStacks = new ArrayList<Stack<Integer>> () {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		add(new Stack<Integer> ());
		add(new Stack<Integer> ());
		add(new Stack<Integer> ());
	}};
	
	public ArrayList<Move> trans(final int from, final int to, final int plates) {
		int tempStack = 3 - from - to;
		if (plates == 1) {
			final int v = mStacks.get(from).pop();
			mStacks.get(to).push(v);
			return new ArrayList<Move> () {/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

			{add(new Move(from, to, v));}};
		}
		ArrayList<Move> ret = trans(from, tempStack, plates - 1);
		int v = (Integer) mStacks.get(from).pop();
		mStacks.get(to).push(v);
		ret.add(new Move(from, to, v));
		ret.addAll(trans(tempStack, to, plates - 1));
		return ret;
	}
	
	private static class Move {
		public int from;
		public int to;
		public int num;
		
		public Move(int from, int to, int num) {
			this.num = num;
			this.from = from;
			this.to = to;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Plate " + num + " is moved from stack " + from + " to stack " + to;
		}
	}
	
	public static void main(String[] args) {
		Problem4 f = new Problem4();
		f.mStacks.get(0).push(5);
		f.mStacks.get(0).push(4);
		f.mStacks.get(0).push(3);
		f.mStacks.get(0).push(2);
		f.mStacks.get(0).push(1);
		ArrayList<Move> ret = f.trans(0, 2, 5);
		for (Move move : ret) {
			System.out.println(move);
		}
	}
}
