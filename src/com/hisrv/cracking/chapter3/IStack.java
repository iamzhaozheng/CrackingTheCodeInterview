package com.hisrv.cracking.chapter3;

public interface IStack<V> {
	public void push(V v);
	public V pop();
	public boolean isEmpty();
	public V peek();
}
