package com.hisrv.cracking.chapter3;

public class Problem1 {
	
	public interface IThreeStacks {
		public void push(int stack, int n);
		public int pop(int stack);
		public int peek(int stack);
		public boolean isEmpty(int stack);
	}
	
	public static class ThreeStacksMean implements IThreeStacks {
		private static final int N = 100;
		private int[] arr = new int[N];
		private int[] size = new int[] {0, 0, 0};
		
		public void push(int stack, int n) {
			if (size[stack] >= N / 3) {
				return;
			}
			arr[size[stack] * 3 + stack] = n;
			size[stack] ++;
		}
		
		public int pop(int stack) {
			if (size[stack] == 0) {
				return -1;
			}
			size[stack] --;
			return arr[size[stack] * 3 + stack];
		}
		
		public int peek(int stack) {
			if (size[stack] == 0) {
				return -1;
			}
			return arr[size[stack] * 3 + stack];
		}
		
		public boolean isEmpty(int stack) {
			return size[stack] == 0;
		}
	}
	
//	public static class ThreeStacksFull implements IThreeStacks {
//		
//	}
	
	public static void main(String[] strs) {
		IThreeStacks stacks = new ThreeStacksMean();
		
	}
}
